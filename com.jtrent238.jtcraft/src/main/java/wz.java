/*    */ import java.util.Random;
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
/*    */ public class wz
/*    */   extends sa
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   
/*    */   public wz(ahb paramahb)
/*    */   {
/* 23 */     super(paramahb);
/* 24 */     this.k = true;
/* 25 */     a(2.0F, 2.0F);
/* 26 */     this.L = (this.N / 2.0F);
/* 27 */     this.b = 5;
/*    */     
/* 29 */     this.a = this.Z.nextInt(100000);
/*    */   }
/*    */   
/*    */   public wz(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 33 */     this(paramahb);
/* 34 */     b(paramDouble1, paramDouble2, paramDouble3);
/*    */   }
/*    */   
/*    */   protected boolean g_()
/*    */   {
/* 39 */     return false;
/*    */   }
/*    */   
/*    */   protected void c()
/*    */   {
/* 44 */     this.af.a(8, Integer.valueOf(this.b));
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 49 */     this.p = this.s;
/* 50 */     this.q = this.t;
/* 51 */     this.r = this.u;
/* 52 */     this.a += 1;
/*    */     
/* 54 */     this.af.b(8, Integer.valueOf(this.b));
/*    */     
/* 56 */     int i = qh.c(this.s);
/* 57 */     int j = qh.c(this.t);
/* 58 */     int k = qh.c(this.u);
/* 59 */     if (((this.o.t instanceof aqr)) && (this.o.a(i, j, k) != ajn.ab)) {
/* 60 */       this.o.b(i, j, k, ajn.ab);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   protected void b(dh paramdh) {}
/*    */   
/*    */ 
/*    */   protected void a(dh paramdh) {}
/*    */   
/*    */ 
/*    */   public float Y()
/*    */   {
/* 74 */     return 0.0F;
/*    */   }
/*    */   
/*    */   public boolean R()
/*    */   {
/* 79 */     return true;
/*    */   }
/*    */   
/*    */   public boolean a(ro paramro, float paramFloat)
/*    */   {
/* 84 */     if (aw()) return false;
/* 85 */     if ((!this.K) && (!this.o.E)) {
/* 86 */       this.b = 0;
/* 87 */       if (this.b <= 0) {
/* 88 */         B();
/* 89 */         if (!this.o.E) {
/* 90 */           this.o.a(null, this.s, this.t, this.u, 6.0F, true);
/*    */         }
/*    */       }
/*    */     }
/* 94 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */