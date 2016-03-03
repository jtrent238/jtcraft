/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsi
/*    */   implements bru
/*    */ {
/*    */   private final boolean a;
/*    */   private final boolean b;
/*    */   private final List c;
/*    */   
/*    */   public bsi(boolean paramBoolean1, boolean paramBoolean2, List paramList)
/*    */   {
/* 19 */     this.a = paramBoolean1;
/* 20 */     this.b = paramBoolean2;
/* 21 */     this.c = paramList;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 25 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 29 */     return this.b;
/*    */   }
/*    */   
/*    */   public List c() {
/* 33 */     return Collections.unmodifiableList(this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bsi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */