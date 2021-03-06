# orchestra-metamodel

## Overview
This project provides a UML meta-model of FIX Orchestra. Users may use the model and generated code for model-driven development.

The model was generated from the Orchestra XML schema by Eclipse Modeling Framework (EMF). 

### Source Schema
The XML schema upon which this project is based is in project [fix-orchestra](https://github.com/FIXTradingCommunity/fix-orchestra). 

The current implementation is conformant to Orchestra Version 1.0 Technical Standard.

### Eclipse Modeling Project
The only prerequisite to use this project is installation of Eclipse Modeling Framework and XML Schema plug-ins for Eclipse.

Models, diagrams and code were generated using [Eclipse Modeling Framework](https://www.eclipse.org/modeling/emf/).

> The EMF project is a modeling framework and code generation facility for building tools and other applications based on a structured data model. 

The model is in Ecore, an implementation of OMG's [Meta Object Facility](https://www.omg.org/spec/MOF/) (MOF). 

> The Meta Object Facility (MOF) provides an open and platform-independent metadata management framework and associated
set of metadata services to enable the development and interoperability of model and metadata driven systems.

### Prerequisites
To translate the Orchestra XML Schema to an ecore model, the following Eclipse plugins are required:

* EMF - Eclipse Modeling Framework SDK
* XSD - XML Schema Definition SDK

### Running
For a tutorial on how to run the tool, see [Generating an EMF Model using XML Schema (XSD)](https://www.eclipse.org/modeling/emf/docs/2.x/tutorials/xlibmod/xlibmod_emf2.0.html)

## License
© Copyright 2018-2021 FIX Protocol Limited

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
