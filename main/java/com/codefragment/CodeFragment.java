package main.java.com.codefragment;

public class CodeFragment {

     private String code;
     private String register;
     
     public CodeFragment() {
         this.code = "";
         this.register = null;
     }
     
     public CodeFragment(String code) {
         this();
         addCode(code);
     }
     
     public CodeFragment(String code, String register) {
         this();
         addCode(code);
         setRegister(register);
     }
     
     public String toString() {
         return this.code;          // pouziva sa pri renderovani sablon
     }
     
     public void addCode(String code) {
         this.code += code;
     }
     
     public void addCode(CodeFragment fragment) {
         this.code += fragment.toString();
     }

     public void setRegister(String register) {
         this.register = register;
     }
     
     public String getRegister() {
         return this.register;
     }

}