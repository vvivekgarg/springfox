/*
 *
 *  Copyright 2016 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */
package springfox.documentation.service;

import springfox.documentation.schema.ModelReference;
import springfox.documentation.schema.ModelSpecification;

import java.util.Objects;

public class Header {
  private final String name;
  private final ModelReference modelReference;
  private final ModelSpecification modelSpecification;
  private final String description;

  public Header(
      String name,
      String description,
      ModelReference modelReference,
      ModelSpecification modelSpecification) {
    this.name = name;
    this.modelReference = modelReference;
    this.description = description;
    this.modelSpecification = modelSpecification;
  }

  public String getName() {
    return name;
  }

  public ModelReference getModelReference() {
    return modelReference;
  }

  public String getDescription() {
    return description;
  }

  public ModelSpecification getModelSpecification() {
    return modelSpecification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Header header = (Header) o;
    return Objects.equals(name, header.name) &&
        Objects.equals(modelReference, header.modelReference) &&
        Objects.equals(modelSpecification, header.modelSpecification) &&
        Objects.equals(description, header.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, modelReference, modelSpecification, description);
  }

  @Override
  public String toString() {
    return new StringBuffer(this.getClass().getSimpleName())
        .append("{")
        .append("name=").append(name).append(", ")
        .append("modelReference=").append(modelReference).append(", ")
        .append("modelSpecification=").append(modelSpecification).append(", ")
        .append("description=").append(description)
        .append("}").toString();
  }
}
