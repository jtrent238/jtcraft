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
/*    */ 
/*    */ 
/*    */ public class jf
/*    */   extends jd
/*    */ {
/*    */   public jf()
/*    */   {
/* 23 */     this.h = true;
/* 24 */     this.i = true;
/*    */   }
/*    */   
/*    */   public jf(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, float paramFloat1, float paramFloat2, boolean paramBoolean) {
/* 28 */     this.a = paramDouble1;
/* 29 */     this.b = paramDouble2;
/* 30 */     this.d = paramDouble3;
/* 31 */     this.c = paramDouble4;
/* 32 */     this.e = paramFloat1;
/* 33 */     this.f = paramFloat2;
/* 34 */     this.g = paramBoolean;
/* 35 */     this.i = true;
/* 36 */     this.h = true;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 41 */     this.a = paramet.readDouble();
/* 42 */     this.b = paramet.readDouble();
/* 43 */     this.d = paramet.readDouble();
/* 44 */     this.c = paramet.readDouble();
/* 45 */     this.e = paramet.readFloat();
/* 46 */     this.f = paramet.readFloat();
/* 47 */     super.a(paramet);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 52 */     paramet.writeDouble(this.a);
/* 53 */     paramet.writeDouble(this.b);
/* 54 */     paramet.writeDouble(this.d);
/* 55 */     paramet.writeDouble(this.c);
/* 56 */     paramet.writeFloat(this.e);
/* 57 */     paramet.writeFloat(this.f);
/* 58 */     super.b(paramet);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\jf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */