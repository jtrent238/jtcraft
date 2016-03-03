/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jk
/*    */   extends ft
/*    */ {
/*    */   private float a;
/*    */   private float b;
/*    */   private boolean c;
/*    */   private boolean d;
/*    */   
/*    */   public jk() {}
/*    */   
/*    */   public jk(float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
/*    */   {
/* 18 */     this.a = paramFloat1;
/* 19 */     this.b = paramFloat2;
/* 20 */     this.c = paramBoolean1;
/* 21 */     this.d = paramBoolean2;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 26 */     this.a = paramet.readFloat();
/* 27 */     this.b = paramet.readFloat();
/* 28 */     this.c = paramet.readBoolean();
/* 29 */     this.d = paramet.readBoolean();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 34 */     paramet.writeFloat(this.a);
/* 35 */     paramet.writeFloat(this.b);
/* 36 */     paramet.writeBoolean(this.c);
/* 37 */     paramet.writeBoolean(this.d);
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 42 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public float c() {
/* 46 */     return this.a;
/*    */   }
/*    */   
/*    */   public float d() {
/* 50 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 54 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean f() {
/* 58 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\jk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */