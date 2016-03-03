/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fu
/*    */   extends ft
/*    */ {
/*    */   private double a;
/*    */   private double b;
/*    */   private double c;
/*    */   private float d;
/*    */   private float e;
/*    */   private boolean f;
/*    */   
/*    */   public fu() {}
/*    */   
/*    */   public fu(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, boolean paramBoolean)
/*    */   {
/* 21 */     this.a = paramDouble1;
/* 22 */     this.b = paramDouble2;
/* 23 */     this.c = paramDouble3;
/* 24 */     this.d = paramFloat1;
/* 25 */     this.e = paramFloat2;
/* 26 */     this.f = paramBoolean;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 31 */     this.a = paramet.readDouble();
/* 32 */     this.b = paramet.readDouble();
/* 33 */     this.c = paramet.readDouble();
/* 34 */     this.d = paramet.readFloat();
/* 35 */     this.e = paramet.readFloat();
/* 36 */     this.f = paramet.readBoolean();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 41 */     paramet.writeDouble(this.a);
/* 42 */     paramet.writeDouble(this.b);
/* 43 */     paramet.writeDouble(this.c);
/* 44 */     paramet.writeFloat(this.d);
/* 45 */     paramet.writeFloat(this.e);
/* 46 */     paramet.writeBoolean(this.f);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 51 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public double c() {
/* 55 */     return this.a;
/*    */   }
/*    */   
/*    */   public double d() {
/* 59 */     return this.b;
/*    */   }
/*    */   
/*    */   public double e() {
/* 63 */     return this.c;
/*    */   }
/*    */   
/*    */   public float f() {
/* 67 */     return this.d;
/*    */   }
/*    */   
/*    */   public float g() {
/* 71 */     return this.e;
/*    */   }
/*    */   
/*    */   public boolean h() {
/* 75 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */