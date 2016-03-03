/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hj
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public hj() {}
/*    */   
/*    */   public hj(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 17 */     this.a = paramInt1;
/* 18 */     this.b = paramInt2;
/* 19 */     this.c = paramInt3;
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 24 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 29 */     this.a = paramet.readInt();
/* 30 */     this.b = paramet.readInt();
/* 31 */     this.c = paramet.readInt();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 36 */     paramet.writeInt(this.a);
/* 37 */     paramet.writeInt(this.b);
/* 38 */     paramet.writeInt(this.c);
/*    */   }
/*    */   
/*    */   public int c() {
/* 42 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 46 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 50 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */