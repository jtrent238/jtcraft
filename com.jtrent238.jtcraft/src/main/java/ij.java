/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ij
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public ij() {}
/*    */   
/*    */   public ij(int paramInt1, int paramInt2)
/*    */   {
/* 16 */     this.a = paramInt1;
/* 17 */     this.b = paramInt2;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 22 */     this.a = paramet.readInt();
/* 23 */     this.b = paramet.readInt();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 28 */     paramet.writeInt(this.a);
/* 29 */     paramet.writeInt(this.b);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 34 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 38 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 42 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */