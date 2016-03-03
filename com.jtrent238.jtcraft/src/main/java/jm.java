/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jm
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private add b;
/*    */   
/*    */   public jm() {}
/*    */   
/*    */   public jm(int paramInt, add paramadd)
/*    */   {
/* 17 */     this.a = paramInt;
/* 18 */     this.b = (paramadd != null ? paramadd.m() : null);
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 23 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 28 */     this.a = paramet.readShort();
/* 29 */     this.b = paramet.c();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 34 */     paramet.writeShort(this.a);
/* 35 */     paramet.a(this.b);
/*    */   }
/*    */   
/*    */   public int c() {
/* 39 */     return this.a;
/*    */   }
/*    */   
/*    */   public add d() {
/* 43 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\jm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */