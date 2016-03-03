/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acx
/*    */   extends adb
/*    */ {
/* 10 */   public final int a = 32;
/*    */   
/*    */   private final int b;
/*    */   private final float c;
/*    */   private final boolean d;
/*    */   private boolean m;
/*    */   private int n;
/*    */   private int o;
/*    */   private int p;
/*    */   private float q;
/*    */   
/*    */   public acx(int paramInt, float paramFloat, boolean paramBoolean)
/*    */   {
/* 23 */     this.b = paramInt;
/* 24 */     this.d = paramBoolean;
/* 25 */     this.c = paramFloat;
/* 26 */     a(abt.h);
/*    */   }
/*    */   
/*    */   public acx(int paramInt, boolean paramBoolean) {
/* 30 */     this(paramInt, 0.6F, paramBoolean);
/*    */   }
/*    */   
/*    */   public add b(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 35 */     paramadd.b -= 1;
/* 36 */     paramyz.bQ().a(this, paramadd);
/* 37 */     paramahb.a(paramyz, "random.burp", 0.5F, paramahb.s.nextFloat() * 0.1F + 0.9F);
/*    */     
/* 39 */     c(paramadd, paramahb, paramyz);
/*    */     
/* 41 */     return paramadd;
/*    */   }
/*    */   
/*    */   protected void c(add paramadd, ahb paramahb, yz paramyz) {
/* 45 */     if ((!paramahb.E) && (this.n > 0) && (paramahb.s.nextFloat() < this.q)) {
/* 46 */       paramyz.c(new rw(this.n, this.o * 20, this.p));
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public int d_(add paramadd)
/*    */   {
/* 53 */     return 32;
/*    */   }
/*    */   
/*    */   public aei d(add paramadd)
/*    */   {
/* 58 */     return aei.b;
/*    */   }
/*    */   
/*    */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 63 */     if (paramyz.g(this.m)) {
/* 64 */       paramyz.a(paramadd, d_(paramadd));
/*    */     }
/* 66 */     return paramadd;
/*    */   }
/*    */   
/*    */   public int g(add paramadd) {
/* 70 */     return this.b;
/*    */   }
/*    */   
/*    */   public float h(add paramadd) {
/* 74 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean i() {
/* 78 */     return this.d;
/*    */   }
/*    */   
/*    */   public acx a(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
/* 82 */     this.n = paramInt1;
/* 83 */     this.o = paramInt2;
/* 84 */     this.p = paramInt3;
/* 85 */     this.q = paramFloat;
/* 86 */     return this;
/*    */   }
/*    */   
/*    */   public acx j() {
/* 90 */     this.m = true;
/* 91 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */