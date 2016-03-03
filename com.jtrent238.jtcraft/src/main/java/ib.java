/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ib
/*    */   extends ft
/*    */ {
/*    */   private float a;
/*    */   private int b;
/*    */   private float c;
/*    */   
/*    */   public ib() {}
/*    */   
/*    */   public ib(float paramFloat1, int paramInt, float paramFloat2)
/*    */   {
/* 17 */     this.a = paramFloat1;
/* 18 */     this.b = paramInt;
/* 19 */     this.c = paramFloat2;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 24 */     this.a = paramet.readFloat();
/* 25 */     this.b = paramet.readShort();
/* 26 */     this.c = paramet.readFloat();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 31 */     paramet.writeFloat(this.a);
/* 32 */     paramet.writeShort(this.b);
/* 33 */     paramet.writeFloat(this.c);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 38 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public float c() {
/* 42 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 46 */     return this.b;
/*    */   }
/*    */   
/*    */   public float e() {
/* 50 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */