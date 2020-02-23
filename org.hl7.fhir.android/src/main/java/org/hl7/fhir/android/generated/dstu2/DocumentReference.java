package org.hl7.fhir.android.generated.dstu2;

/*-
 * #%L
 * org.hl7.fhir.dstu2
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatus;
import org.hl7.fhir.dstu2.model.Enumerations.DocumentReferenceStatusEnumFactory;
import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum.DocumentRelationshipType;
import org.hl7.fhir.android.generated.dstu2.DocumentReferenceEnum.DocumentRelationshipTypeEnumFactory;

/**
 * A reference to a document .
 */
@ResourceDef(name = "DocumentReference", profile = "http://hl7.org/fhir/Profile/DocumentReference")
public class DocumentReference extends DomainResource {

    @Block()
    public static class DocumentReferenceRelatesToComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * The type of relationship that this document has with anther document.
         */
        @Child(name = "code", type = { CodeType.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "replaces | transforms | signs | appends", formalDefinition = "The type of relationship that this document has with anther document.")
        protected Enumeration<DocumentRelationshipType> code;

        /**
         * The target document of this relationship.
         */
        @Child(name = "target", type = { DocumentReference.class }, order = 2, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Target of the relationship", formalDefinition = "The target document of this relationship.")
        protected Reference target;

        /**
         * The actual object that is the target of the reference (The target document of this relationship.)
         */
        protected DocumentReference targetTarget;

        private static final long serialVersionUID = -347257495L;

        /*
     * Constructor
     */
        public DocumentReferenceRelatesToComponent() {
            super();
        }

        /*
     * Constructor
     */
        public DocumentReferenceRelatesToComponent(Enumeration<DocumentRelationshipType> code, Reference target) {
            super();
            this.code = code;
            this.target = target;
        }

        /**
         * @return {@link #code} (The type of relationship that this document has with anther document.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
         */
        public Enumeration<DocumentRelationshipType> getCodeElement() {
            if (this.code == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceRelatesToComponent.code");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.code = new Enumeration<DocumentRelationshipType>(new DocumentRelationshipTypeEnumFactory());
            return this.code;
        }

        public boolean hasCodeElement() {
            return this.code != null && !this.code.isEmpty();
        }

        public boolean hasCode() {
            return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (The type of relationship that this document has with anther document.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
         */
        public DocumentReferenceRelatesToComponent setCodeElement(Enumeration<DocumentRelationshipType> value) {
            this.code = value;
            return this;
        }

        /**
         * @return The type of relationship that this document has with anther document.
         */
        public DocumentRelationshipType getCode() {
            return this.code == null ? null : this.code.getValue();
        }

        /**
         * @param value The type of relationship that this document has with anther document.
         */
        public DocumentReferenceRelatesToComponent setCode(DocumentRelationshipType value) {
            if (this.code == null)
                this.code = new Enumeration<DocumentRelationshipType>(new DocumentRelationshipTypeEnumFactory());
            this.code.setValue(value);
            return this;
        }

        /**
         * @return {@link #target} (The target document of this relationship.)
         */
        public Reference getTarget() {
            if (this.target == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceRelatesToComponent.target");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.target = new Reference();
            return this.target;
        }

        public boolean hasTarget() {
            return this.target != null && !this.target.isEmpty();
        }

        /**
         * @param value {@link #target} (The target document of this relationship.)
         */
        public DocumentReferenceRelatesToComponent setTarget(Reference value) {
            this.target = value;
            return this;
        }

        /**
         * @return {@link #target} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The target document of this relationship.)
         */
        public DocumentReference getTargetTarget() {
            if (this.targetTarget == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceRelatesToComponent.target");
                else if (Configuration.doAutoCreate())
                    // aa
                    this.targetTarget = new DocumentReference();
            return this.targetTarget;
        }

        /**
         * @param value {@link #target} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The target document of this relationship.)
         */
        public DocumentReferenceRelatesToComponent setTargetTarget(DocumentReference value) {
            this.targetTarget = value;
            return this;
        }

        protected void listChildren(List<Property> childrenList) {
            super.listChildren(childrenList);
            childrenList.add(new Property("code", "code", "The type of relationship that this document has with anther document.", 0, java.lang.Integer.MAX_VALUE, code));
            childrenList.add(new Property("target", "Reference(DocumentReference)", "The target document of this relationship.", 0, java.lang.Integer.MAX_VALUE, target));
        }

        @Override
        public void setProperty(String name, Base value) throws FHIRException {
            if (name.equals("code"))
                // Enumeration<DocumentRelationshipType>
                this.code = new DocumentRelationshipTypeEnumFactory().fromType(value);
            else if (name.equals("target"))
                // Reference
                this.target = castToReference(value);
            else
                super.setProperty(name, value);
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("code")) {
                throw new FHIRException("Cannot call addChild on a primitive type DocumentReference.code");
            } else if (name.equals("target")) {
                this.target = new Reference();
                return this.target;
            } else
                return super.addChild(name);
        }

        public DocumentReferenceRelatesToComponent copy() {
            DocumentReferenceRelatesToComponent dst = new DocumentReferenceRelatesToComponent();
            copyValues(dst);
            dst.code = code == null ? null : code.copy();
            dst.target = target == null ? null : target.copy();
            return dst;
        }

        @Override
        public boolean equalsDeep(Base other) {
            if (!super.equalsDeep(other))
                return false;
            if (!(other instanceof DocumentReferenceRelatesToComponent))
                return false;
            DocumentReferenceRelatesToComponent o = (DocumentReferenceRelatesToComponent) other;
            return compareDeep(code, o.code, true) && compareDeep(target, o.target, true);
        }

        @Override
        public boolean equalsShallow(Base other) {
            if (!super.equalsShallow(other))
                return false;
            if (!(other instanceof DocumentReferenceRelatesToComponent))
                return false;
            DocumentReferenceRelatesToComponent o = (DocumentReferenceRelatesToComponent) other;
            return compareValues(code, o.code, true);
        }

        public boolean isEmpty() {
            return super.isEmpty() && (code == null || code.isEmpty()) && (target == null || target.isEmpty());
        }

        public String fhirType() {
            return "DocumentReference.relatesTo";
        }
    }

    @Block()
    public static class DocumentReferenceContentComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * The document or url of the document along with critical metadata to prove content has integrity.
         */
        @Child(name = "attachment", type = { Attachment.class }, order = 1, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Where to access the document", formalDefinition = "The document or url of the document along with critical metadata to prove content has integrity.")
        protected Attachment attachment;

        /**
         * An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.
         */
        @Child(name = "format", type = { Coding.class }, order = 2, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
        @Description(shortDefinition = "Format/content rules for the document", formalDefinition = "An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.")
        protected List<Coding> format;

        private static final long serialVersionUID = -1412643085L;

        /*
     * Constructor
     */
        public DocumentReferenceContentComponent() {
            super();
        }

        /*
     * Constructor
     */
        public DocumentReferenceContentComponent(Attachment attachment) {
            super();
            this.attachment = attachment;
        }

        /**
         * @return {@link #attachment} (The document or url of the document along with critical metadata to prove content has integrity.)
         */
        public Attachment getAttachment() {
            if (this.attachment == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceContentComponent.attachment");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.attachment = new Attachment();
            return this.attachment;
        }

        public boolean hasAttachment() {
            return this.attachment != null && !this.attachment.isEmpty();
        }

        /**
         * @param value {@link #attachment} (The document or url of the document along with critical metadata to prove content has integrity.)
         */
        public DocumentReferenceContentComponent setAttachment(Attachment value) {
            this.attachment = value;
            return this;
        }

        /**
         * @return {@link #format} (An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.)
         */
        public List<Coding> getFormat() {
            if (this.format == null)
                this.format = new ArrayList<Coding>();
            return this.format;
        }

        public boolean hasFormat() {
            if (this.format == null)
                return false;
            for (Coding item : this.format) if (!item.isEmpty())
                return true;
            return false;
        }

        /**
         * @return {@link #format} (An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.)
         */
        // syntactic sugar
        public Coding addFormat() {
            // 3
            Coding t = new Coding();
            if (this.format == null)
                this.format = new ArrayList<Coding>();
            this.format.add(t);
            return t;
        }

        // syntactic sugar
        public DocumentReferenceContentComponent addFormat(Coding t) {
            // 3
            if (t == null)
                return this;
            if (this.format == null)
                this.format = new ArrayList<Coding>();
            this.format.add(t);
            return this;
        }

        protected void listChildren(List<Property> childrenList) {
            super.listChildren(childrenList);
            childrenList.add(new Property("attachment", "Attachment", "The document or url of the document along with critical metadata to prove content has integrity.", 0, java.lang.Integer.MAX_VALUE, attachment));
            childrenList.add(new Property("format", "Coding", "An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.", 0, java.lang.Integer.MAX_VALUE, format));
        }

        @Override
        public void setProperty(String name, Base value) throws FHIRException {
            if (name.equals("attachment"))
                // Attachment
                this.attachment = castToAttachment(value);
            else if (name.equals("format"))
                this.getFormat().add(castToCoding(value));
            else
                super.setProperty(name, value);
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("attachment")) {
                this.attachment = new Attachment();
                return this.attachment;
            } else if (name.equals("format")) {
                return addFormat();
            } else
                return super.addChild(name);
        }

        public DocumentReferenceContentComponent copy() {
            DocumentReferenceContentComponent dst = new DocumentReferenceContentComponent();
            copyValues(dst);
            dst.attachment = attachment == null ? null : attachment.copy();
            if (format != null) {
                dst.format = new ArrayList<Coding>();
                for (Coding i : format) dst.format.add(i.copy());
            }
            ;
            return dst;
        }

        @Override
        public boolean equalsDeep(Base other) {
            if (!super.equalsDeep(other))
                return false;
            if (!(other instanceof DocumentReferenceContentComponent))
                return false;
            DocumentReferenceContentComponent o = (DocumentReferenceContentComponent) other;
            return compareDeep(attachment, o.attachment, true) && compareDeep(format, o.format, true);
        }

        @Override
        public boolean equalsShallow(Base other) {
            if (!super.equalsShallow(other))
                return false;
            if (!(other instanceof DocumentReferenceContentComponent))
                return false;
            DocumentReferenceContentComponent o = (DocumentReferenceContentComponent) other;
            return true;
        }

        public boolean isEmpty() {
            return super.isEmpty() && (attachment == null || attachment.isEmpty()) && (format == null || format.isEmpty());
        }

        public String fhirType() {
            return "DocumentReference.content";
        }
    }

    @Block()
    public static class DocumentReferenceContextComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * Describes the clinical encounter or type of care that the document content is associated with.
         */
        @Child(name = "encounter", type = { Encounter.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Context of the document  content", formalDefinition = "Describes the clinical encounter or type of care that the document content is associated with.")
        protected Reference encounter;

        /**
         * The actual object that is the target of the reference (Describes the clinical encounter or type of care that the document content is associated with.)
         */
        protected Encounter encounterTarget;

        /**
         * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
         */
        @Child(name = "event", type = { CodeableConcept.class }, order = 2, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
        @Description(shortDefinition = "Main Clinical Acts Documented", formalDefinition = "This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act.")
        protected List<CodeableConcept> event;

        /**
         * The time period over which the service that is described by the document was provided.
         */
        @Child(name = "period", type = { Period.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Time of service that is being documented", formalDefinition = "The time period over which the service that is described by the document was provided.")
        protected Period period;

        /**
         * The kind of facility where the patient was seen.
         */
        @Child(name = "facilityType", type = { CodeableConcept.class }, order = 4, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Kind of facility where patient was seen", formalDefinition = "The kind of facility where the patient was seen.")
        protected CodeableConcept facilityType;

        /**
         * This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.
         */
        @Child(name = "practiceSetting", type = { CodeableConcept.class }, order = 5, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Additional details about where the content was created (e.g. clinical specialty)", formalDefinition = "This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.")
        protected CodeableConcept practiceSetting;

        /**
         * The Patient Information as known when the document was published. May be a reference to a version specific, or contained.
         */
        @Child(name = "sourcePatientInfo", type = { Patient.class }, order = 6, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Patient demographics from source", formalDefinition = "The Patient Information as known when the document was published. May be a reference to a version specific, or contained.")
        protected Reference sourcePatientInfo;

        /**
         * The actual object that is the target of the reference (The Patient Information as known when the document was published. May be a reference to a version specific, or contained.)
         */
        protected Patient sourcePatientInfoTarget;

        /**
         * Related identifiers or resources associated with the DocumentReference.
         */
        @Child(name = "related", type = {}, order = 7, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
        @Description(shortDefinition = "Related identifiers or resources", formalDefinition = "Related identifiers or resources associated with the DocumentReference.")
        protected List<DocumentReferenceContextRelatedComponent> related;

        private static final long serialVersionUID = 994799273L;

        /*
     * Constructor
     */
        public DocumentReferenceContextComponent() {
            super();
        }

        /**
         * @return {@link #encounter} (Describes the clinical encounter or type of care that the document content is associated with.)
         */
        public Reference getEncounter() {
            if (this.encounter == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceContextComponent.encounter");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.encounter = new Reference();
            return this.encounter;
        }

        public boolean hasEncounter() {
            return this.encounter != null && !this.encounter.isEmpty();
        }

        /**
         * @param value {@link #encounter} (Describes the clinical encounter or type of care that the document content is associated with.)
         */
        public DocumentReferenceContextComponent setEncounter(Reference value) {
            this.encounter = value;
            return this;
        }

        /**
         * @return {@link #encounter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Describes the clinical encounter or type of care that the document content is associated with.)
         */
        public Encounter getEncounterTarget() {
            if (this.encounterTarget == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceContextComponent.encounter");
                else if (Configuration.doAutoCreate())
                    // aa
                    this.encounterTarget = new Encounter();
            return this.encounterTarget;
        }

        /**
         * @param value {@link #encounter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Describes the clinical encounter or type of care that the document content is associated with.)
         */
        public DocumentReferenceContextComponent setEncounterTarget(Encounter value) {
            this.encounterTarget = value;
            return this;
        }

        /**
         * @return {@link #event} (This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.)
         */
        public List<CodeableConcept> getEvent() {
            if (this.event == null)
                this.event = new ArrayList<CodeableConcept>();
            return this.event;
        }

        public boolean hasEvent() {
            if (this.event == null)
                return false;
            for (CodeableConcept item : this.event) if (!item.isEmpty())
                return true;
            return false;
        }

        /**
         * @return {@link #event} (This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.)
         */
        // syntactic sugar
        public CodeableConcept addEvent() {
            // 3
            CodeableConcept t = new CodeableConcept();
            if (this.event == null)
                this.event = new ArrayList<CodeableConcept>();
            this.event.add(t);
            return t;
        }

        // syntactic sugar
        public DocumentReferenceContextComponent addEvent(CodeableConcept t) {
            // 3
            if (t == null)
                return this;
            if (this.event == null)
                this.event = new ArrayList<CodeableConcept>();
            this.event.add(t);
            return this;
        }

        /**
         * @return {@link #period} (The time period over which the service that is described by the document was provided.)
         */
        public Period getPeriod() {
            if (this.period == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceContextComponent.period");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.period = new Period();
            return this.period;
        }

        public boolean hasPeriod() {
            return this.period != null && !this.period.isEmpty();
        }

        /**
         * @param value {@link #period} (The time period over which the service that is described by the document was provided.)
         */
        public DocumentReferenceContextComponent setPeriod(Period value) {
            this.period = value;
            return this;
        }

        /**
         * @return {@link #facilityType} (The kind of facility where the patient was seen.)
         */
        public CodeableConcept getFacilityType() {
            if (this.facilityType == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceContextComponent.facilityType");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.facilityType = new CodeableConcept();
            return this.facilityType;
        }

        public boolean hasFacilityType() {
            return this.facilityType != null && !this.facilityType.isEmpty();
        }

        /**
         * @param value {@link #facilityType} (The kind of facility where the patient was seen.)
         */
        public DocumentReferenceContextComponent setFacilityType(CodeableConcept value) {
            this.facilityType = value;
            return this;
        }

        /**
         * @return {@link #practiceSetting} (This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.)
         */
        public CodeableConcept getPracticeSetting() {
            if (this.practiceSetting == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceContextComponent.practiceSetting");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.practiceSetting = new CodeableConcept();
            return this.practiceSetting;
        }

        public boolean hasPracticeSetting() {
            return this.practiceSetting != null && !this.practiceSetting.isEmpty();
        }

        /**
         * @param value {@link #practiceSetting} (This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.)
         */
        public DocumentReferenceContextComponent setPracticeSetting(CodeableConcept value) {
            this.practiceSetting = value;
            return this;
        }

        /**
         * @return {@link #sourcePatientInfo} (The Patient Information as known when the document was published. May be a reference to a version specific, or contained.)
         */
        public Reference getSourcePatientInfo() {
            if (this.sourcePatientInfo == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceContextComponent.sourcePatientInfo");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.sourcePatientInfo = new Reference();
            return this.sourcePatientInfo;
        }

        public boolean hasSourcePatientInfo() {
            return this.sourcePatientInfo != null && !this.sourcePatientInfo.isEmpty();
        }

        /**
         * @param value {@link #sourcePatientInfo} (The Patient Information as known when the document was published. May be a reference to a version specific, or contained.)
         */
        public DocumentReferenceContextComponent setSourcePatientInfo(Reference value) {
            this.sourcePatientInfo = value;
            return this;
        }

        /**
         * @return {@link #sourcePatientInfo} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The Patient Information as known when the document was published. May be a reference to a version specific, or contained.)
         */
        public Patient getSourcePatientInfoTarget() {
            if (this.sourcePatientInfoTarget == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceContextComponent.sourcePatientInfo");
                else if (Configuration.doAutoCreate())
                    // aa
                    this.sourcePatientInfoTarget = new Patient();
            return this.sourcePatientInfoTarget;
        }

        /**
         * @param value {@link #sourcePatientInfo} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The Patient Information as known when the document was published. May be a reference to a version specific, or contained.)
         */
        public DocumentReferenceContextComponent setSourcePatientInfoTarget(Patient value) {
            this.sourcePatientInfoTarget = value;
            return this;
        }

        /**
         * @return {@link #related} (Related identifiers or resources associated with the DocumentReference.)
         */
        public List<DocumentReferenceContextRelatedComponent> getRelated() {
            if (this.related == null)
                this.related = new ArrayList<DocumentReferenceContextRelatedComponent>();
            return this.related;
        }

        public boolean hasRelated() {
            if (this.related == null)
                return false;
            for (DocumentReferenceContextRelatedComponent item : this.related) if (!item.isEmpty())
                return true;
            return false;
        }

        /**
         * @return {@link #related} (Related identifiers or resources associated with the DocumentReference.)
         */
        // syntactic sugar
        public DocumentReferenceContextRelatedComponent addRelated() {
            // 3
            DocumentReferenceContextRelatedComponent t = new DocumentReferenceContextRelatedComponent();
            if (this.related == null)
                this.related = new ArrayList<DocumentReferenceContextRelatedComponent>();
            this.related.add(t);
            return t;
        }

        // syntactic sugar
        public DocumentReferenceContextComponent addRelated(DocumentReferenceContextRelatedComponent t) {
            // 3
            if (t == null)
                return this;
            if (this.related == null)
                this.related = new ArrayList<DocumentReferenceContextRelatedComponent>();
            this.related.add(t);
            return this;
        }

        protected void listChildren(List<Property> childrenList) {
            super.listChildren(childrenList);
            childrenList.add(new Property("encounter", "Reference(Encounter)", "Describes the clinical encounter or type of care that the document content is associated with.", 0, java.lang.Integer.MAX_VALUE, encounter));
            childrenList.add(new Property("event", "CodeableConcept", "This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act.", 0, java.lang.Integer.MAX_VALUE, event));
            childrenList.add(new Property("period", "Period", "The time period over which the service that is described by the document was provided.", 0, java.lang.Integer.MAX_VALUE, period));
            childrenList.add(new Property("facilityType", "CodeableConcept", "The kind of facility where the patient was seen.", 0, java.lang.Integer.MAX_VALUE, facilityType));
            childrenList.add(new Property("practiceSetting", "CodeableConcept", "This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.", 0, java.lang.Integer.MAX_VALUE, practiceSetting));
            childrenList.add(new Property("sourcePatientInfo", "Reference(Patient)", "The Patient Information as known when the document was published. May be a reference to a version specific, or contained.", 0, java.lang.Integer.MAX_VALUE, sourcePatientInfo));
            childrenList.add(new Property("related", "", "Related identifiers or resources associated with the DocumentReference.", 0, java.lang.Integer.MAX_VALUE, related));
        }

        @Override
        public void setProperty(String name, Base value) throws FHIRException {
            if (name.equals("encounter"))
                // Reference
                this.encounter = castToReference(value);
            else if (name.equals("event"))
                this.getEvent().add(castToCodeableConcept(value));
            else if (name.equals("period"))
                // Period
                this.period = castToPeriod(value);
            else if (name.equals("facilityType"))
                // CodeableConcept
                this.facilityType = castToCodeableConcept(value);
            else if (name.equals("practiceSetting"))
                // CodeableConcept
                this.practiceSetting = castToCodeableConcept(value);
            else if (name.equals("sourcePatientInfo"))
                // Reference
                this.sourcePatientInfo = castToReference(value);
            else if (name.equals("related"))
                this.getRelated().add((DocumentReferenceContextRelatedComponent) value);
            else
                super.setProperty(name, value);
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("encounter")) {
                this.encounter = new Reference();
                return this.encounter;
            } else if (name.equals("event")) {
                return addEvent();
            } else if (name.equals("period")) {
                this.period = new Period();
                return this.period;
            } else if (name.equals("facilityType")) {
                this.facilityType = new CodeableConcept();
                return this.facilityType;
            } else if (name.equals("practiceSetting")) {
                this.practiceSetting = new CodeableConcept();
                return this.practiceSetting;
            } else if (name.equals("sourcePatientInfo")) {
                this.sourcePatientInfo = new Reference();
                return this.sourcePatientInfo;
            } else if (name.equals("related")) {
                return addRelated();
            } else
                return super.addChild(name);
        }

        public DocumentReferenceContextComponent copy() {
            DocumentReferenceContextComponent dst = new DocumentReferenceContextComponent();
            copyValues(dst);
            dst.encounter = encounter == null ? null : encounter.copy();
            if (event != null) {
                dst.event = new ArrayList<CodeableConcept>();
                for (CodeableConcept i : event) dst.event.add(i.copy());
            }
            ;
            dst.period = period == null ? null : period.copy();
            dst.facilityType = facilityType == null ? null : facilityType.copy();
            dst.practiceSetting = practiceSetting == null ? null : practiceSetting.copy();
            dst.sourcePatientInfo = sourcePatientInfo == null ? null : sourcePatientInfo.copy();
            if (related != null) {
                dst.related = new ArrayList<DocumentReferenceContextRelatedComponent>();
                for (DocumentReferenceContextRelatedComponent i : related) dst.related.add(i.copy());
            }
            ;
            return dst;
        }

        @Override
        public boolean equalsDeep(Base other) {
            if (!super.equalsDeep(other))
                return false;
            if (!(other instanceof DocumentReferenceContextComponent))
                return false;
            DocumentReferenceContextComponent o = (DocumentReferenceContextComponent) other;
            return compareDeep(encounter, o.encounter, true) && compareDeep(event, o.event, true) && compareDeep(period, o.period, true) && compareDeep(facilityType, o.facilityType, true) && compareDeep(practiceSetting, o.practiceSetting, true) && compareDeep(sourcePatientInfo, o.sourcePatientInfo, true) && compareDeep(related, o.related, true);
        }

        @Override
        public boolean equalsShallow(Base other) {
            if (!super.equalsShallow(other))
                return false;
            if (!(other instanceof DocumentReferenceContextComponent))
                return false;
            DocumentReferenceContextComponent o = (DocumentReferenceContextComponent) other;
            return true;
        }

        public boolean isEmpty() {
            return super.isEmpty() && (encounter == null || encounter.isEmpty()) && (event == null || event.isEmpty()) && (period == null || period.isEmpty()) && (facilityType == null || facilityType.isEmpty()) && (practiceSetting == null || practiceSetting.isEmpty()) && (sourcePatientInfo == null || sourcePatientInfo.isEmpty()) && (related == null || related.isEmpty());
        }

        public String fhirType() {
            return "DocumentReference.context";
        }
    }

    @Block()
    public static class DocumentReferenceContextRelatedComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.
         */
        @Child(name = "identifier", type = { Identifier.class }, order = 1, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Identifier of related objects or events", formalDefinition = "Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.")
        protected Identifier identifier;

        /**
         * Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.
         */
        @Child(name = "ref", type = {}, order = 2, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Related Resource", formalDefinition = "Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.")
        protected Reference ref;

        /**
         * The actual object that is the target of the reference (Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
         */
        protected Resource refTarget;

        private static final long serialVersionUID = -1670123330L;

        /*
     * Constructor
     */
        public DocumentReferenceContextRelatedComponent() {
            super();
        }

        /**
         * @return {@link #identifier} (Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
         */
        public Identifier getIdentifier() {
            if (this.identifier == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceContextRelatedComponent.identifier");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.identifier = new Identifier();
            return this.identifier;
        }

        public boolean hasIdentifier() {
            return this.identifier != null && !this.identifier.isEmpty();
        }

        /**
         * @param value {@link #identifier} (Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
         */
        public DocumentReferenceContextRelatedComponent setIdentifier(Identifier value) {
            this.identifier = value;
            return this;
        }

        /**
         * @return {@link #ref} (Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
         */
        public Reference getRef() {
            if (this.ref == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create DocumentReferenceContextRelatedComponent.ref");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.ref = new Reference();
            return this.ref;
        }

        public boolean hasRef() {
            return this.ref != null && !this.ref.isEmpty();
        }

        /**
         * @param value {@link #ref} (Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
         */
        public DocumentReferenceContextRelatedComponent setRef(Reference value) {
            this.ref = value;
            return this;
        }

        /**
         * @return {@link #ref} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
         */
        public Resource getRefTarget() {
            return this.refTarget;
        }

        /**
         * @param value {@link #ref} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.)
         */
        public DocumentReferenceContextRelatedComponent setRefTarget(Resource value) {
            this.refTarget = value;
            return this;
        }

        protected void listChildren(List<Property> childrenList) {
            super.listChildren(childrenList);
            childrenList.add(new Property("identifier", "Identifier", "Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.", 0, java.lang.Integer.MAX_VALUE, identifier));
            childrenList.add(new Property("ref", "Reference(Any)", "Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.", 0, java.lang.Integer.MAX_VALUE, ref));
        }

        @Override
        public void setProperty(String name, Base value) throws FHIRException {
            if (name.equals("identifier"))
                // Identifier
                this.identifier = castToIdentifier(value);
            else if (name.equals("ref"))
                // Reference
                this.ref = castToReference(value);
            else
                super.setProperty(name, value);
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("identifier")) {
                this.identifier = new Identifier();
                return this.identifier;
            } else if (name.equals("ref")) {
                this.ref = new Reference();
                return this.ref;
            } else
                return super.addChild(name);
        }

        public DocumentReferenceContextRelatedComponent copy() {
            DocumentReferenceContextRelatedComponent dst = new DocumentReferenceContextRelatedComponent();
            copyValues(dst);
            dst.identifier = identifier == null ? null : identifier.copy();
            dst.ref = ref == null ? null : ref.copy();
            return dst;
        }

        @Override
        public boolean equalsDeep(Base other) {
            if (!super.equalsDeep(other))
                return false;
            if (!(other instanceof DocumentReferenceContextRelatedComponent))
                return false;
            DocumentReferenceContextRelatedComponent o = (DocumentReferenceContextRelatedComponent) other;
            return compareDeep(identifier, o.identifier, true) && compareDeep(ref, o.ref, true);
        }

        @Override
        public boolean equalsShallow(Base other) {
            if (!super.equalsShallow(other))
                return false;
            if (!(other instanceof DocumentReferenceContextRelatedComponent))
                return false;
            DocumentReferenceContextRelatedComponent o = (DocumentReferenceContextRelatedComponent) other;
            return true;
        }

        public boolean isEmpty() {
            return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (ref == null || ref.isEmpty());
        }

        public String fhirType() {
            return "DocumentReference.context.related";
        }
    }

    /**
     * Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.
     */
    @Child(name = "masterIdentifier", type = { Identifier.class }, order = 0, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Master Version Specific Identifier", formalDefinition = "Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.")
    protected Identifier masterIdentifier;

    /**
     * Other identifiers associated with the document, including version independent identifiers.
     */
    @Child(name = "identifier", type = { Identifier.class }, order = 1, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Other identifiers for the document", formalDefinition = "Other identifiers associated with the document, including version independent identifiers.")
    protected List<Identifier> identifier;

    /**
     * Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).
     */
    @Child(name = "subject", type = { Patient.class, Practitioner.class, Group.class, Device.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Who/what is the subject of the document", formalDefinition = "Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).")
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).)
     */
    protected Resource subjectTarget;

    /**
     * Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.
     */
    @Child(name = "type", type = { CodeableConcept.class }, order = 3, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Kind of document (LOINC if possible)", formalDefinition = "Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.")
    protected CodeableConcept type;

    /**
     * A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.
     */
    @Child(name = "class", type = { CodeableConcept.class }, order = 4, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Categorization of document", formalDefinition = "A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.")
    protected CodeableConcept class_;

    /**
     * Identifies who is responsible for adding the information to the document.
     */
    @Child(name = "author", type = { Practitioner.class, Organization.class, Device.class, Patient.class, RelatedPerson.class }, order = 5, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Who and/or what authored the document", formalDefinition = "Identifies who is responsible for adding the information to the document.")
    protected List<Reference> author;

    /**
     * The actual objects that are the target of the reference (Identifies who is responsible for adding the information to the document.)
     */
    protected List<Resource> authorTarget;

    /**
     * Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.
     */
    @Child(name = "custodian", type = { Organization.class }, order = 6, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Organization which maintains the document", formalDefinition = "Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.")
    protected Reference custodian;

    /**
     * The actual object that is the target of the reference (Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.)
     */
    protected Organization custodianTarget;

    /**
     * Which person or organization authenticates that this document is valid.
     */
    @Child(name = "authenticator", type = { Practitioner.class, Organization.class }, order = 7, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Who/what authenticated the document", formalDefinition = "Which person or organization authenticates that this document is valid.")
    protected Reference authenticator;

    /**
     * The actual object that is the target of the reference (Which person or organization authenticates that this document is valid.)
     */
    protected Resource authenticatorTarget;

    /**
     * When the document was created.
     */
    @Child(name = "created", type = { DateTimeType.class }, order = 8, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Document creation time", formalDefinition = "When the document was created.")
    protected DateTimeType created;

    /**
     * When the document reference was created.
     */
    @Child(name = "indexed", type = { InstantType.class }, order = 9, min = 1, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "When this document reference created", formalDefinition = "When the document reference was created.")
    protected InstantType indexed;

    /**
     * The status of this document reference.
     */
    @Child(name = "status", type = { CodeType.class }, order = 10, min = 1, max = 1, modifier = true, summary = true)
    @Description(shortDefinition = "current | superseded | entered-in-error", formalDefinition = "The status of this document reference.")
    protected Enumeration<DocumentReferenceStatus> status;

    /**
     * The status of the underlying document.
     */
    @Child(name = "docStatus", type = { CodeableConcept.class }, order = 11, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "preliminary | final | appended | amended | entered-in-error", formalDefinition = "The status of the underlying document.")
    protected CodeableConcept docStatus;

    /**
     * Relationships that this document has with other document references that already exist.
     */
    @Child(name = "relatesTo", type = {}, order = 12, min = 0, max = Child.MAX_UNLIMITED, modifier = true, summary = true)
    @Description(shortDefinition = "Relationships to other documents", formalDefinition = "Relationships that this document has with other document references that already exist.")
    protected List<DocumentReferenceRelatesToComponent> relatesTo;

    /**
     * Human-readable description of the source document. This is sometimes known as the "title".
     */
    @Child(name = "description", type = { StringType.class }, order = 13, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Human-readable description (title)", formalDefinition = "Human-readable description of the source document. This is sometimes known as the \"title\".")
    protected StringType description;

    /**
     * A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the "reference" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.
     */
    @Child(name = "securityLabel", type = { CodeableConcept.class }, order = 14, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Document security-tags", formalDefinition = "A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \"reference\" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.")
    protected List<CodeableConcept> securityLabel;

    /**
     * The document and format referenced. There may be multiple content element repetitions, each with a different format.
     */
    @Child(name = "content", type = {}, order = 15, min = 1, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "Document referenced", formalDefinition = "The document and format referenced. There may be multiple content element repetitions, each with a different format.")
    protected List<DocumentReferenceContentComponent> content;

    /**
     * The clinical context in which the document was prepared.
     */
    @Child(name = "context", type = {}, order = 16, min = 0, max = 1, modifier = false, summary = true)
    @Description(shortDefinition = "Clinical context of document", formalDefinition = "The clinical context in which the document was prepared.")
    protected DocumentReferenceContextComponent context;

    private static final long serialVersionUID = -1009325322L;

    /*
   * Constructor
   */
    public DocumentReference() {
        super();
    }

    /*
   * Constructor
   */
    public DocumentReference(CodeableConcept type, InstantType indexed, Enumeration<DocumentReferenceStatus> status) {
        super();
        this.type = type;
        this.indexed = indexed;
        this.status = status;
    }

    /**
     * @return {@link #masterIdentifier} (Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.)
     */
    public Identifier getMasterIdentifier() {
        if (this.masterIdentifier == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.masterIdentifier");
            else if (Configuration.doAutoCreate())
                // cc
                this.masterIdentifier = new Identifier();
        return this.masterIdentifier;
    }

    public boolean hasMasterIdentifier() {
        return this.masterIdentifier != null && !this.masterIdentifier.isEmpty();
    }

    /**
     * @param value {@link #masterIdentifier} (Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.)
     */
    public DocumentReference setMasterIdentifier(Identifier value) {
        this.masterIdentifier = value;
        return this;
    }

    /**
     * @return {@link #identifier} (Other identifiers associated with the document, including version independent identifiers.)
     */
    public List<Identifier> getIdentifier() {
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        return this.identifier;
    }

    public boolean hasIdentifier() {
        if (this.identifier == null)
            return false;
        for (Identifier item : this.identifier) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #identifier} (Other identifiers associated with the document, including version independent identifiers.)
     */
    // syntactic sugar
    public Identifier addIdentifier() {
        // 3
        Identifier t = new Identifier();
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentReference addIdentifier(Identifier t) {
        // 3
        if (t == null)
            return this;
        if (this.identifier == null)
            this.identifier = new ArrayList<Identifier>();
        this.identifier.add(t);
        return this;
    }

    /**
     * @return {@link #subject} (Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).)
     */
    public Reference getSubject() {
        if (this.subject == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.subject");
            else if (Configuration.doAutoCreate())
                // cc
                this.subject = new Reference();
        return this.subject;
    }

    public boolean hasSubject() {
        return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).)
     */
    public DocumentReference setSubject(Reference value) {
        this.subject = value;
        return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).)
     */
    public Resource getSubjectTarget() {
        return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).)
     */
    public DocumentReference setSubjectTarget(Resource value) {
        this.subjectTarget = value;
        return this;
    }

    /**
     * @return {@link #type} (Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.)
     */
    public CodeableConcept getType() {
        if (this.type == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.type");
            else if (Configuration.doAutoCreate())
                // cc
                this.type = new CodeableConcept();
        return this.type;
    }

    public boolean hasType() {
        return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.)
     */
    public DocumentReference setType(CodeableConcept value) {
        this.type = value;
        return this;
    }

    /**
     * @return {@link #class_} (A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.)
     */
    public CodeableConcept getClass_() {
        if (this.class_ == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.class_");
            else if (Configuration.doAutoCreate())
                // cc
                this.class_ = new CodeableConcept();
        return this.class_;
    }

    public boolean hasClass_() {
        return this.class_ != null && !this.class_.isEmpty();
    }

    /**
     * @param value {@link #class_} (A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.)
     */
    public DocumentReference setClass_(CodeableConcept value) {
        this.class_ = value;
        return this;
    }

    /**
     * @return {@link #author} (Identifies who is responsible for adding the information to the document.)
     */
    public List<Reference> getAuthor() {
        if (this.author == null)
            this.author = new ArrayList<Reference>();
        return this.author;
    }

    public boolean hasAuthor() {
        if (this.author == null)
            return false;
        for (Reference item : this.author) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #author} (Identifies who is responsible for adding the information to the document.)
     */
    // syntactic sugar
    public Reference addAuthor() {
        // 3
        Reference t = new Reference();
        if (this.author == null)
            this.author = new ArrayList<Reference>();
        this.author.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentReference addAuthor(Reference t) {
        // 3
        if (t == null)
            return this;
        if (this.author == null)
            this.author = new ArrayList<Reference>();
        this.author.add(t);
        return this;
    }

    /**
     * @return {@link #author} (The actual objects that are the target of the reference. The reference library doesn't populate this, but you can use this to hold the resources if you resolvethemt. Identifies who is responsible for adding the information to the document.)
     */
    public List<Resource> getAuthorTarget() {
        if (this.authorTarget == null)
            this.authorTarget = new ArrayList<Resource>();
        return this.authorTarget;
    }

    /**
     * @return {@link #custodian} (Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.)
     */
    public Reference getCustodian() {
        if (this.custodian == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.custodian");
            else if (Configuration.doAutoCreate())
                // cc
                this.custodian = new Reference();
        return this.custodian;
    }

    public boolean hasCustodian() {
        return this.custodian != null && !this.custodian.isEmpty();
    }

    /**
     * @param value {@link #custodian} (Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.)
     */
    public DocumentReference setCustodian(Reference value) {
        this.custodian = value;
        return this;
    }

    /**
     * @return {@link #custodian} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.)
     */
    public Organization getCustodianTarget() {
        if (this.custodianTarget == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.custodian");
            else if (Configuration.doAutoCreate())
                // aa
                this.custodianTarget = new Organization();
        return this.custodianTarget;
    }

    /**
     * @param value {@link #custodian} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.)
     */
    public DocumentReference setCustodianTarget(Organization value) {
        this.custodianTarget = value;
        return this;
    }

    /**
     * @return {@link #authenticator} (Which person or organization authenticates that this document is valid.)
     */
    public Reference getAuthenticator() {
        if (this.authenticator == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.authenticator");
            else if (Configuration.doAutoCreate())
                // cc
                this.authenticator = new Reference();
        return this.authenticator;
    }

    public boolean hasAuthenticator() {
        return this.authenticator != null && !this.authenticator.isEmpty();
    }

    /**
     * @param value {@link #authenticator} (Which person or organization authenticates that this document is valid.)
     */
    public DocumentReference setAuthenticator(Reference value) {
        this.authenticator = value;
        return this;
    }

    /**
     * @return {@link #authenticator} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Which person or organization authenticates that this document is valid.)
     */
    public Resource getAuthenticatorTarget() {
        return this.authenticatorTarget;
    }

    /**
     * @param value {@link #authenticator} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Which person or organization authenticates that this document is valid.)
     */
    public DocumentReference setAuthenticatorTarget(Resource value) {
        this.authenticatorTarget = value;
        return this;
    }

    /**
     * @return {@link #created} (When the document was created.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() {
        if (this.created == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.created");
            else if (Configuration.doAutoCreate())
                // bb
                this.created = new DateTimeType();
        return this.created;
    }

    public boolean hasCreatedElement() {
        return this.created != null && !this.created.isEmpty();
    }

    public boolean hasCreated() {
        return this.created != null && !this.created.isEmpty();
    }

    /**
     * @param value {@link #created} (When the document was created.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DocumentReference setCreatedElement(DateTimeType value) {
        this.created = value;
        return this;
    }

    /**
     * @return When the document was created.
     */
    public Date getCreated() {
        return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value When the document was created.
     */
    public DocumentReference setCreated(Date value) {
        if (value == null)
            this.created = null;
        else {
            if (this.created == null)
                this.created = new DateTimeType();
            this.created.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #indexed} (When the document reference was created.). This is the underlying object with id, value and extensions. The accessor "getIndexed" gives direct access to the value
     */
    public InstantType getIndexedElement() {
        if (this.indexed == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.indexed");
            else if (Configuration.doAutoCreate())
                // bb
                this.indexed = new InstantType();
        return this.indexed;
    }

    public boolean hasIndexedElement() {
        return this.indexed != null && !this.indexed.isEmpty();
    }

    public boolean hasIndexed() {
        return this.indexed != null && !this.indexed.isEmpty();
    }

    /**
     * @param value {@link #indexed} (When the document reference was created.). This is the underlying object with id, value and extensions. The accessor "getIndexed" gives direct access to the value
     */
    public DocumentReference setIndexedElement(InstantType value) {
        this.indexed = value;
        return this;
    }

    /**
     * @return When the document reference was created.
     */
    public Date getIndexed() {
        return this.indexed == null ? null : this.indexed.getValue();
    }

    /**
     * @param value When the document reference was created.
     */
    public DocumentReference setIndexed(Date value) {
        if (this.indexed == null)
            this.indexed = new InstantType();
        this.indexed.setValue(value);
        return this;
    }

    /**
     * @return {@link #status} (The status of this document reference.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<DocumentReferenceStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<DocumentReferenceStatus>(new DocumentReferenceStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of this document reference.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public DocumentReference setStatusElement(Enumeration<DocumentReferenceStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of this document reference.
     */
    public DocumentReferenceStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this document reference.
     */
    public DocumentReference setStatus(DocumentReferenceStatus value) {
        if (this.status == null)
            this.status = new Enumeration<DocumentReferenceStatus>(new DocumentReferenceStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #docStatus} (The status of the underlying document.)
     */
    public CodeableConcept getDocStatus() {
        if (this.docStatus == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.docStatus");
            else if (Configuration.doAutoCreate())
                // cc
                this.docStatus = new CodeableConcept();
        return this.docStatus;
    }

    public boolean hasDocStatus() {
        return this.docStatus != null && !this.docStatus.isEmpty();
    }

    /**
     * @param value {@link #docStatus} (The status of the underlying document.)
     */
    public DocumentReference setDocStatus(CodeableConcept value) {
        this.docStatus = value;
        return this;
    }

    /**
     * @return {@link #relatesTo} (Relationships that this document has with other document references that already exist.)
     */
    public List<DocumentReferenceRelatesToComponent> getRelatesTo() {
        if (this.relatesTo == null)
            this.relatesTo = new ArrayList<DocumentReferenceRelatesToComponent>();
        return this.relatesTo;
    }

    public boolean hasRelatesTo() {
        if (this.relatesTo == null)
            return false;
        for (DocumentReferenceRelatesToComponent item : this.relatesTo) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #relatesTo} (Relationships that this document has with other document references that already exist.)
     */
    // syntactic sugar
    public DocumentReferenceRelatesToComponent addRelatesTo() {
        // 3
        DocumentReferenceRelatesToComponent t = new DocumentReferenceRelatesToComponent();
        if (this.relatesTo == null)
            this.relatesTo = new ArrayList<DocumentReferenceRelatesToComponent>();
        this.relatesTo.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentReference addRelatesTo(DocumentReferenceRelatesToComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.relatesTo == null)
            this.relatesTo = new ArrayList<DocumentReferenceRelatesToComponent>();
        this.relatesTo.add(t);
        return this;
    }

    /**
     * @return {@link #description} (Human-readable description of the source document. This is sometimes known as the "title".). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public StringType getDescriptionElement() {
        if (this.description == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.description");
            else if (Configuration.doAutoCreate())
                // bb
                this.description = new StringType();
        return this.description;
    }

    public boolean hasDescriptionElement() {
        return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() {
        return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (Human-readable description of the source document. This is sometimes known as the "title".). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public DocumentReference setDescriptionElement(StringType value) {
        this.description = value;
        return this;
    }

    /**
     * @return Human-readable description of the source document. This is sometimes known as the "title".
     */
    public String getDescription() {
        return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value Human-readable description of the source document. This is sometimes known as the "title".
     */
    public DocumentReference setDescription(String value) {
        if (Utilities.noString(value))
            this.description = null;
        else {
            if (this.description == null)
                this.description = new StringType();
            this.description.setValue(value);
        }
        return this;
    }

    /**
     * @return {@link #securityLabel} (A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the "reference" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.)
     */
    public List<CodeableConcept> getSecurityLabel() {
        if (this.securityLabel == null)
            this.securityLabel = new ArrayList<CodeableConcept>();
        return this.securityLabel;
    }

    public boolean hasSecurityLabel() {
        if (this.securityLabel == null)
            return false;
        for (CodeableConcept item : this.securityLabel) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #securityLabel} (A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the "reference" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.)
     */
    // syntactic sugar
    public CodeableConcept addSecurityLabel() {
        // 3
        CodeableConcept t = new CodeableConcept();
        if (this.securityLabel == null)
            this.securityLabel = new ArrayList<CodeableConcept>();
        this.securityLabel.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentReference addSecurityLabel(CodeableConcept t) {
        // 3
        if (t == null)
            return this;
        if (this.securityLabel == null)
            this.securityLabel = new ArrayList<CodeableConcept>();
        this.securityLabel.add(t);
        return this;
    }

    /**
     * @return {@link #content} (The document and format referenced. There may be multiple content element repetitions, each with a different format.)
     */
    public List<DocumentReferenceContentComponent> getContent() {
        if (this.content == null)
            this.content = new ArrayList<DocumentReferenceContentComponent>();
        return this.content;
    }

    public boolean hasContent() {
        if (this.content == null)
            return false;
        for (DocumentReferenceContentComponent item : this.content) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #content} (The document and format referenced. There may be multiple content element repetitions, each with a different format.)
     */
    // syntactic sugar
    public DocumentReferenceContentComponent addContent() {
        // 3
        DocumentReferenceContentComponent t = new DocumentReferenceContentComponent();
        if (this.content == null)
            this.content = new ArrayList<DocumentReferenceContentComponent>();
        this.content.add(t);
        return t;
    }

    // syntactic sugar
    public DocumentReference addContent(DocumentReferenceContentComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.content == null)
            this.content = new ArrayList<DocumentReferenceContentComponent>();
        this.content.add(t);
        return this;
    }

    /**
     * @return {@link #context} (The clinical context in which the document was prepared.)
     */
    public DocumentReferenceContextComponent getContext() {
        if (this.context == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create DocumentReference.context");
            else if (Configuration.doAutoCreate())
                // cc
                this.context = new DocumentReferenceContextComponent();
        return this.context;
    }

    public boolean hasContext() {
        return this.context != null && !this.context.isEmpty();
    }

    /**
     * @param value {@link #context} (The clinical context in which the document was prepared.)
     */
    public DocumentReference setContext(DocumentReferenceContextComponent value) {
        this.context = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("masterIdentifier", "Identifier", "Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.", 0, java.lang.Integer.MAX_VALUE, masterIdentifier));
        childrenList.add(new Property("identifier", "Identifier", "Other identifiers associated with the document, including version independent identifiers.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("subject", "Reference(Patient|Practitioner|Group|Device)", "Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).", 0, java.lang.Integer.MAX_VALUE, subject));
        childrenList.add(new Property("type", "CodeableConcept", "Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("class", "CodeableConcept", "A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.", 0, java.lang.Integer.MAX_VALUE, class_));
        childrenList.add(new Property("author", "Reference(Practitioner|Organization|Device|Patient|RelatedPerson)", "Identifies who is responsible for adding the information to the document.", 0, java.lang.Integer.MAX_VALUE, author));
        childrenList.add(new Property("custodian", "Reference(Organization)", "Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.", 0, java.lang.Integer.MAX_VALUE, custodian));
        childrenList.add(new Property("authenticator", "Reference(Practitioner|Organization)", "Which person or organization authenticates that this document is valid.", 0, java.lang.Integer.MAX_VALUE, authenticator));
        childrenList.add(new Property("created", "dateTime", "When the document was created.", 0, java.lang.Integer.MAX_VALUE, created));
        childrenList.add(new Property("indexed", "instant", "When the document reference was created.", 0, java.lang.Integer.MAX_VALUE, indexed));
        childrenList.add(new Property("status", "code", "The status of this document reference.", 0, java.lang.Integer.MAX_VALUE, status));
        childrenList.add(new Property("docStatus", "CodeableConcept", "The status of the underlying document.", 0, java.lang.Integer.MAX_VALUE, docStatus));
        childrenList.add(new Property("relatesTo", "", "Relationships that this document has with other document references that already exist.", 0, java.lang.Integer.MAX_VALUE, relatesTo));
        childrenList.add(new Property("description", "string", "Human-readable description of the source document. This is sometimes known as the \"title\".", 0, java.lang.Integer.MAX_VALUE, description));
        childrenList.add(new Property("securityLabel", "CodeableConcept", "A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the \"reference\" to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.", 0, java.lang.Integer.MAX_VALUE, securityLabel));
        childrenList.add(new Property("content", "", "The document and format referenced. There may be multiple content element repetitions, each with a different format.", 0, java.lang.Integer.MAX_VALUE, content));
        childrenList.add(new Property("context", "", "The clinical context in which the document was prepared.", 0, java.lang.Integer.MAX_VALUE, context));
    }

    @Override
    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("masterIdentifier"))
            // Identifier
            this.masterIdentifier = castToIdentifier(value);
        else if (name.equals("identifier"))
            this.getIdentifier().add(castToIdentifier(value));
        else if (name.equals("subject"))
            // Reference
            this.subject = castToReference(value);
        else if (name.equals("type"))
            // CodeableConcept
            this.type = castToCodeableConcept(value);
        else if (name.equals("class"))
            // CodeableConcept
            this.class_ = castToCodeableConcept(value);
        else if (name.equals("author"))
            this.getAuthor().add(castToReference(value));
        else if (name.equals("custodian"))
            // Reference
            this.custodian = castToReference(value);
        else if (name.equals("authenticator"))
            // Reference
            this.authenticator = castToReference(value);
        else if (name.equals("created"))
            // DateTimeType
            this.created = castToDateTime(value);
        else if (name.equals("indexed"))
            // InstantType
            this.indexed = castToInstant(value);
        else if (name.equals("status"))
            // Enumeration<DocumentReferenceStatus>
            this.status = new DocumentReferenceStatusEnumFactory().fromType(value);
        else if (name.equals("docStatus"))
            // CodeableConcept
            this.docStatus = castToCodeableConcept(value);
        else if (name.equals("relatesTo"))
            this.getRelatesTo().add((DocumentReferenceRelatesToComponent) value);
        else if (name.equals("description"))
            // StringType
            this.description = castToString(value);
        else if (name.equals("securityLabel"))
            this.getSecurityLabel().add(castToCodeableConcept(value));
        else if (name.equals("content"))
            this.getContent().add((DocumentReferenceContentComponent) value);
        else if (name.equals("context"))
            // DocumentReferenceContextComponent
            this.context = (DocumentReferenceContextComponent) value;
        else
            super.setProperty(name, value);
    }

    @Override
    public Base addChild(String name) throws FHIRException {
        if (name.equals("masterIdentifier")) {
            this.masterIdentifier = new Identifier();
            return this.masterIdentifier;
        } else if (name.equals("identifier")) {
            return addIdentifier();
        } else if (name.equals("subject")) {
            this.subject = new Reference();
            return this.subject;
        } else if (name.equals("type")) {
            this.type = new CodeableConcept();
            return this.type;
        } else if (name.equals("class")) {
            this.class_ = new CodeableConcept();
            return this.class_;
        } else if (name.equals("author")) {
            return addAuthor();
        } else if (name.equals("custodian")) {
            this.custodian = new Reference();
            return this.custodian;
        } else if (name.equals("authenticator")) {
            this.authenticator = new Reference();
            return this.authenticator;
        } else if (name.equals("created")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentReference.created");
        } else if (name.equals("indexed")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentReference.indexed");
        } else if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentReference.status");
        } else if (name.equals("docStatus")) {
            this.docStatus = new CodeableConcept();
            return this.docStatus;
        } else if (name.equals("relatesTo")) {
            return addRelatesTo();
        } else if (name.equals("description")) {
            throw new FHIRException("Cannot call addChild on a primitive type DocumentReference.description");
        } else if (name.equals("securityLabel")) {
            return addSecurityLabel();
        } else if (name.equals("content")) {
            return addContent();
        } else if (name.equals("context")) {
            this.context = new DocumentReferenceContextComponent();
            return this.context;
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "DocumentReference";
    }

    public DocumentReference copy() {
        DocumentReference dst = new DocumentReference();
        copyValues(dst);
        dst.masterIdentifier = masterIdentifier == null ? null : masterIdentifier.copy();
        if (identifier != null) {
            dst.identifier = new ArrayList<Identifier>();
            for (Identifier i : identifier) dst.identifier.add(i.copy());
        }
        ;
        dst.subject = subject == null ? null : subject.copy();
        dst.type = type == null ? null : type.copy();
        dst.class_ = class_ == null ? null : class_.copy();
        if (author != null) {
            dst.author = new ArrayList<Reference>();
            for (Reference i : author) dst.author.add(i.copy());
        }
        ;
        dst.custodian = custodian == null ? null : custodian.copy();
        dst.authenticator = authenticator == null ? null : authenticator.copy();
        dst.created = created == null ? null : created.copy();
        dst.indexed = indexed == null ? null : indexed.copy();
        dst.status = status == null ? null : status.copy();
        dst.docStatus = docStatus == null ? null : docStatus.copy();
        if (relatesTo != null) {
            dst.relatesTo = new ArrayList<DocumentReferenceRelatesToComponent>();
            for (DocumentReferenceRelatesToComponent i : relatesTo) dst.relatesTo.add(i.copy());
        }
        ;
        dst.description = description == null ? null : description.copy();
        if (securityLabel != null) {
            dst.securityLabel = new ArrayList<CodeableConcept>();
            for (CodeableConcept i : securityLabel) dst.securityLabel.add(i.copy());
        }
        ;
        if (content != null) {
            dst.content = new ArrayList<DocumentReferenceContentComponent>();
            for (DocumentReferenceContentComponent i : content) dst.content.add(i.copy());
        }
        ;
        dst.context = context == null ? null : context.copy();
        return dst;
    }

    protected DocumentReference typedCopy() {
        return copy();
    }

    @Override
    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof DocumentReference))
            return false;
        DocumentReference o = (DocumentReference) other;
        return compareDeep(masterIdentifier, o.masterIdentifier, true) && compareDeep(identifier, o.identifier, true) && compareDeep(subject, o.subject, true) && compareDeep(type, o.type, true) && compareDeep(class_, o.class_, true) && compareDeep(author, o.author, true) && compareDeep(custodian, o.custodian, true) && compareDeep(authenticator, o.authenticator, true) && compareDeep(created, o.created, true) && compareDeep(indexed, o.indexed, true) && compareDeep(status, o.status, true) && compareDeep(docStatus, o.docStatus, true) && compareDeep(relatesTo, o.relatesTo, true) && compareDeep(description, o.description, true) && compareDeep(securityLabel, o.securityLabel, true) && compareDeep(content, o.content, true) && compareDeep(context, o.context, true);
    }

    @Override
    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof DocumentReference))
            return false;
        DocumentReference o = (DocumentReference) other;
        return compareValues(created, o.created, true) && compareValues(indexed, o.indexed, true) && compareValues(status, o.status, true) && compareValues(description, o.description, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (masterIdentifier == null || masterIdentifier.isEmpty()) && (identifier == null || identifier.isEmpty()) && (subject == null || subject.isEmpty()) && (type == null || type.isEmpty()) && (class_ == null || class_.isEmpty()) && (author == null || author.isEmpty()) && (custodian == null || custodian.isEmpty()) && (authenticator == null || authenticator.isEmpty()) && (created == null || created.isEmpty()) && (indexed == null || indexed.isEmpty()) && (status == null || status.isEmpty()) && (docStatus == null || docStatus.isEmpty()) && (relatesTo == null || relatesTo.isEmpty()) && (description == null || description.isEmpty()) && (securityLabel == null || securityLabel.isEmpty()) && (content == null || content.isEmpty()) && (context == null || context.isEmpty());
    }

    @Override
    public ResourceType getResourceType() {
        return ResourceType.DocumentReference;
    }

    @SearchParamDefinition(name = "securitylabel", path = "DocumentReference.securityLabel", description = "Document security-tags", type = "token")
    public static final String SP_SECURITYLABEL = "securitylabel";

    @SearchParamDefinition(name = "subject", path = "DocumentReference.subject", description = "Who/what is the subject of the document", type = "reference")
    public static final String SP_SUBJECT = "subject";

    @SearchParamDefinition(name = "description", path = "DocumentReference.description", description = "Human-readable description (title)", type = "string")
    public static final String SP_DESCRIPTION = "description";

    @SearchParamDefinition(name = "language", path = "DocumentReference.content.attachment.language", description = "Human language of the content (BCP-47)", type = "token")
    public static final String SP_LANGUAGE = "language";

    @SearchParamDefinition(name = "type", path = "DocumentReference.type", description = "Kind of document (LOINC if possible)", type = "token")
    public static final String SP_TYPE = "type";

    @SearchParamDefinition(name = "relation", path = "DocumentReference.relatesTo.code", description = "replaces | transforms | signs | appends", type = "token")
    public static final String SP_RELATION = "relation";

    @SearchParamDefinition(name = "setting", path = "DocumentReference.context.practiceSetting", description = "Additional details about where the content was created (e.g. clinical specialty)", type = "token")
    public static final String SP_SETTING = "setting";

    @SearchParamDefinition(name = "patient", path = "DocumentReference.subject", description = "Who/what is the subject of the document", type = "reference")
    public static final String SP_PATIENT = "patient";

    @SearchParamDefinition(name = "relationship", path = "null", description = "Combination of relation and relatesTo", type = "composite")
    public static final String SP_RELATIONSHIP = "relationship";

    @SearchParamDefinition(name = "event", path = "DocumentReference.context.event", description = "Main Clinical Acts Documented", type = "token")
    public static final String SP_EVENT = "event";

    @SearchParamDefinition(name = "class", path = "DocumentReference.class", description = "Categorization of document", type = "token")
    public static final String SP_CLASS = "class";

    @SearchParamDefinition(name = "authenticator", path = "DocumentReference.authenticator", description = "Who/what authenticated the document", type = "reference")
    public static final String SP_AUTHENTICATOR = "authenticator";

    @SearchParamDefinition(name = "identifier", path = "DocumentReference.masterIdentifier | DocumentReference.identifier", description = "Master Version Specific Identifier", type = "token")
    public static final String SP_IDENTIFIER = "identifier";

    @SearchParamDefinition(name = "period", path = "DocumentReference.context.period", description = "Time of service that is being documented", type = "date")
    public static final String SP_PERIOD = "period";

    @SearchParamDefinition(name = "related-id", path = "DocumentReference.context.related.identifier", description = "Identifier of related objects or events", type = "token")
    public static final String SP_RELATEDID = "related-id";

    @SearchParamDefinition(name = "custodian", path = "DocumentReference.custodian", description = "Organization which maintains the document", type = "reference")
    public static final String SP_CUSTODIAN = "custodian";

    @SearchParamDefinition(name = "indexed", path = "DocumentReference.indexed", description = "When this document reference created", type = "date")
    public static final String SP_INDEXED = "indexed";

    @SearchParamDefinition(name = "author", path = "DocumentReference.author", description = "Who and/or what authored the document", type = "reference")
    public static final String SP_AUTHOR = "author";

    @SearchParamDefinition(name = "created", path = "DocumentReference.created", description = "Document creation time", type = "date")
    public static final String SP_CREATED = "created";

    @SearchParamDefinition(name = "format", path = "DocumentReference.content.format", description = "Format/content rules for the document", type = "token")
    public static final String SP_FORMAT = "format";

    @SearchParamDefinition(name = "encounter", path = "DocumentReference.context.encounter", description = "Context of the document  content", type = "reference")
    public static final String SP_ENCOUNTER = "encounter";

    @SearchParamDefinition(name = "related-ref", path = "DocumentReference.context.related.ref", description = "Related Resource", type = "reference")
    public static final String SP_RELATEDREF = "related-ref";

    @SearchParamDefinition(name = "location", path = "DocumentReference.content.attachment.url", description = "Uri where the data can be found", type = "uri")
    public static final String SP_LOCATION = "location";

    @SearchParamDefinition(name = "relatesto", path = "DocumentReference.relatesTo.target", description = "Target of the relationship", type = "reference")
    public static final String SP_RELATESTO = "relatesto";

    @SearchParamDefinition(name = "facility", path = "DocumentReference.context.facilityType", description = "Kind of facility where patient was seen", type = "token")
    public static final String SP_FACILITY = "facility";

    @SearchParamDefinition(name = "status", path = "DocumentReference.status", description = "current | superseded | entered-in-error", type = "token")
    public static final String SP_STATUS = "status";
}
