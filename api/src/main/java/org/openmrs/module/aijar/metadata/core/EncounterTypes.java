package org.openmrs.module.aijar.metadata.core;

import org.openmrs.module.metadatadeploy.descriptor.EncounterTypeDescriptor;

/**
 * Created by lubwamasamuel on 18/10/16.
 */
public class EncounterTypes {
    public static EncounterTypeDescriptor PNC_ENCOUNTER_TYPE = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "PNC - Encounter";
        }

        @Override
        public String description() {
            return "An encounter when a patient gets PNC services";
        }

        public String uuid() {
            return "fa6f3ff5-b784-43fb-ab35-a08ab7dbf074";
        }
    };

    public static EncounterTypeDescriptor SMC_FOLLOW_UP_ENCOUNTER = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "SMC FOLLOW UP - Encounter";
        }

        @Override
        public String description() {
            return "An encounter for SMC Follow up";
        }

        public String uuid() {
            return "d0f9e0b7-f336-43bd-bf50-0a7243857fa6";
        }
    };

    public static EncounterTypeDescriptor OPD_ENCOUNTER = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "OPD Encounter";
        }

        @Override
        public String description() {
            return "Outpatient Clinical Ecnounter";
        }

        public String uuid() {
            return "ee4780f5-b5eb-423b-932f-00b5879df5ab";
        }
    };

    public static EncounterTypeDescriptor TB_SUMMARY_ENCOUNTER = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "TB Summary (Enrollment)";
        }

        @Override
        public String description() {
            return "An encounter for the initial visit to the TB clinic";
        }

        public String uuid() {
            return "334bf97e-28e2-4a27-8727-a5ce31c7cd66";
        }
    };


    public static EncounterTypeDescriptor VIRAL_LOAD_NON_SUPPRESSED  = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Viral Load Non Suppressed Encounter";
        }

        @Override
        public String description() {
            return "Viral Load Non Suppressed Follow up";
        }

        public String uuid() {
            return "38cb2232-30fc-4b1f-8df1-47c795771ee9";
        }
    };
   public static EncounterTypeDescriptor IFPR_ENCOUNTER_TYPE = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "IFPR - Encounter";
        }

        @Override
        public String description() {
            return "An encounter when a patient gets Integrated Family Planning services";
        }

        public String uuid() {
            return "8513e07b-7a94-4f65-8cd4-2f93933d9f77";
        }
    };   
   
    public static EncounterTypeDescriptor INTERGRATED_FAMILY_PLANNING_REGISTER  = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Intergrated Family Planning";
        }

        @Override
        public String description() {
            return "Family planning followup";
        }

        public String uuid() { return     "8761118b-63d4-4427-b3a4-9e92ebfaf6ec";
//        public String uuid() { return     "557d09b4-a00d-4795-bf59-441ff847270f";
        }
    };
}
