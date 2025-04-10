
    class Outer {
        int outerData;
    
        Outer(int data) {
            this.outerData = data;
        }
    
        void outerMethod() {
            System.out.println("Outer class method. Data = " + outerData);
        }
    
        // Static Inner Class
        static class StaticInner {
            String message;
    
            StaticInner(String msg) {
                this.message = msg;
            }
    
            static void staticMethod() {
                System.out.println("Static method in static inner class.");
            }
    
            void nonStaticMethod() {
                System.out.println("Non-static method in static inner class. Message = " + message);
            }
        }
    
        // Non-static Inner Class
        class NonStaticInner {
            int value;
    
            NonStaticInner(int value) {
                this.value = value;
            }
    
            void display() {
                System.out.println("Non-static inner class method. Value = " + value);
            }
    
            // Static methods are not allowed here
            // static void staticMethod() {} // This would cause a compilation error
        }
    }
    
    public class outerinner {
        public static void main(String[] args) {
            // Create Outer class object
            Outer outerObj = new Outer(100);
            outerObj.outerMethod();
    
            // Create Static Inner class object
            Outer.StaticInner staticInnerObj = new Outer.StaticInner("Hello Static Inner");
            Outer.StaticInner.staticMethod();  // Static method can be called directly using class
            staticInnerObj.nonStaticMethod();
    
            // Create Non-Static Inner class object
            Outer.NonStaticInner nonStaticInnerObj = outerObj.new NonStaticInner(42);
            nonStaticInnerObj.display();
        }
    }
