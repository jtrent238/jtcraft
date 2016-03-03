/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ia
/*    */   extends ft
/*    */ {
/*    */   private float a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public ia() {}
/*    */   
/*    */   public ia(float paramFloat, int paramInt1, int paramInt2)
/*    */   {
/* 17 */     this.a = paramFloat;
/* 18 */     this.b = paramInt1;
/* 19 */     this.c = paramInt2;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 24 */     this.a = paramet.readFloat();
/* 25 */     this.c = paramet.readShort();
/* 26 */     this.b = paramet.readShort();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 31 */     paramet.writeFloat(this.a);
/* 32 */     paramet.writeShort(this.c);
/* 33 */     paramet.writeShort(this.b);
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
/*    */   public int e() {
/* 50 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */