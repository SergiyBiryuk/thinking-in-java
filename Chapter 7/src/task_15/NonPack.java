package task_15;

import task_15.pack.Basic;

class NonPack {
    public static void main(String[] args) {
        // Basic.f();  !!!ERROR!!!
    }
}

class Inherited extends Basic {
    public static void main(String[] args) {
        Basic.f();
    }
}
