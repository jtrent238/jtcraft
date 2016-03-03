/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aem
/*    */   extends adb
/*    */ {
/*    */   public aem()
/*    */   {
/* 22 */     e(1);
/*    */   }
/*    */   
/*    */   public static boolean a(dh paramdh)
/*    */   {
/* 27 */     if (!ael.a(paramdh)) {
/* 28 */       return false;
/*    */     }
/*    */     
/* 31 */     if (!paramdh.b("title", 8)) {
/* 32 */       return false;
/*    */     }
/* 34 */     String str = paramdh.j("title");
/* 35 */     if ((str == null) || (str.length() > 16)) {
/* 36 */       return false;
/*    */     }
/*    */     
/* 39 */     if (!paramdh.b("author", 8)) {
/* 40 */       return false;
/*    */     }
/*    */     
/* 43 */     return true;
/*    */   }
/*    */   
/*    */   public String n(add paramadd)
/*    */   {
/* 48 */     if (paramadd.p()) {
/* 49 */       dh localdh = paramadd.q();
/*    */       
/* 51 */       String str = localdh.j("title");
/* 52 */       if (!qn.b(str)) {
/* 53 */         return str;
/*    */       }
/*    */     }
/* 56 */     return super.n(paramadd);
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(add paramadd, yz paramyz, List paramList, boolean paramBoolean)
/*    */   {
/* 62 */     if (paramadd.p()) {
/* 63 */       dh localdh = paramadd.q();
/*    */       
/* 65 */       String str = localdh.j("author");
/* 66 */       if (!qn.b(str)) {
/* 67 */         paramList.add(a.h + dd.a("book.byAuthor", new Object[] { str }));
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 74 */     paramyz.b(paramadd);
/* 75 */     return paramadd;
/*    */   }
/*    */   
/*    */   public boolean s()
/*    */   {
/* 80 */     return true;
/*    */   }
/*    */   
/*    */   public boolean e(add paramadd)
/*    */   {
/* 85 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */