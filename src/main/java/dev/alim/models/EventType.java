package dev.alim.models;

public enum EventType {
    University_Course {
        @Override
        public String toString() {
            return ("University Course");
        }
    },
    Seminar{
        @Override
        public String toString() {
            return ("Seminars");
        }
    },
    Certification_Preparation_Class{
        @Override
        public String toString() {
            return ("Certification Preparation Class");
        }
    },
    Certification{
        @Override
        public String toString() {
            return ("Certification");
        }
    },
    Technical_Training{
        @Override
        public String toString() {
            return ("Technical Training");
        }
    },
    Other{
        @Override
        public String toString() {
            return ("Other");
        }
    }
}