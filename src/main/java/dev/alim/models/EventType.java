package dev.alim.models;

public enum EventType {
    University_Courses {
        @Override
        public String toString() {
            return ("University Courses");
        }
    },
    Seminars{
        @Override
        public String toString() {
            return ("Seminars");
        }
    },
    Certification_Preparation_Classes{
        @Override
        public String toString() {
            return ("Certification Preparation Classes");
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