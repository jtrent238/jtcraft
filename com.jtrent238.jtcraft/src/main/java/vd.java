/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vd
/*    */   extends ui
/*    */ {
/*    */   private final sw a;
/*    */   private final yi b;
/*    */   private sv c;
/* 12 */   private int d = -1;
/*    */   private double e;
/*    */   private int f;
/*    */   private int g;
/*    */   private int h;
/*    */   private float i;
/*    */   private float j;
/*    */   
/*    */   public vd(yi paramyi, double paramDouble, int paramInt, float paramFloat) {
/* 21 */     this(paramyi, paramDouble, paramInt, paramInt, paramFloat);
/*    */   }
/*    */   
/*    */   public vd(yi paramyi, double paramDouble, int paramInt1, int paramInt2, float paramFloat) {
/* 25 */     if (!(paramyi instanceof sv)) {
/* 26 */       throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
/*    */     }
/* 28 */     this.b = paramyi;
/* 29 */     this.a = ((sw)paramyi);
/* 30 */     this.e = paramDouble;
/* 31 */     this.g = paramInt1;
/* 32 */     this.h = paramInt2;
/* 33 */     this.i = paramFloat;
/* 34 */     this.j = (paramFloat * paramFloat);
/* 35 */     a(3);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 40 */     sv localsv = this.a.o();
/* 41 */     if (localsv == null) return false;
/* 42 */     this.c = localsv;
/* 43 */     return true;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 48 */     return (a()) || (!this.a.m().g());
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 53 */     this.c = null;
/* 54 */     this.f = 0;
/* 55 */     this.d = -1;
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 60 */     double d1 = this.a.e(this.c.s, this.c.C.b, this.c.u);
/* 61 */     boolean bool = this.a.n().a(this.c);
/*    */     
/* 63 */     if (bool) {
/* 64 */       this.f += 1;
/*    */     } else {
/* 66 */       this.f = 0;
/*    */     }
/*    */     
/* 69 */     if ((d1 > this.j) || (this.f < 20)) {
/* 70 */       this.a.m().a(this.c, this.e);
/*    */     } else {
/* 72 */       this.a.m().h();
/*    */     }
/*    */     
/* 75 */     this.a.j().a(this.c, 30.0F, 30.0F);
/*    */     float f1;
/* 77 */     if (--this.d == 0) {
/* 78 */       if ((d1 > this.j) || (!bool)) { return;
/*    */       }
/* 80 */       f1 = qh.a(d1) / this.i;
/* 81 */       float f2 = f1;
/* 82 */       if (f2 < 0.1F) f2 = 0.1F;
/* 83 */       if (f2 > 1.0F) { f2 = 1.0F;
/*    */       }
/* 85 */       this.b.a(this.c, f2);
/* 86 */       this.d = qh.d(f1 * (this.h - this.g) + this.g);
/* 87 */     } else if (this.d < 0) {
/* 88 */       f1 = qh.a(d1) / this.i;
/* 89 */       this.d = qh.d(f1 * (this.h - this.g) + this.g);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */