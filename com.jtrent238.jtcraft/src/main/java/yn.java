/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class yn
/*     */   extends yg
/*     */ {
/*     */   public yn(ahb paramahb)
/*     */   {
/*  19 */     super(paramahb);
/*  20 */     a(1.4F, 0.9F);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  25 */     super.c();
/*     */     
/*  27 */     this.af.a(16, new Byte((byte)0));
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  32 */     super.h();
/*     */     
/*  34 */     if (!this.o.E)
/*     */     {
/*     */ 
/*  37 */       a(this.E);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  43 */     super.aD();
/*     */     
/*  45 */     a(yj.a).a(16.0D);
/*  46 */     a(yj.d).a(0.800000011920929D);
/*     */   }
/*     */   
/*     */   protected sa bR()
/*     */   {
/*  51 */     float f = d(1.0F);
/*  52 */     if (f < 0.5F) {
/*  53 */       double d = 16.0D;
/*  54 */       return this.o.b(this, d);
/*     */     }
/*  56 */     return null;
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/*  61 */     return "mob.spider.say";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/*  66 */     return "mob.spider.say";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/*  71 */     return "mob.spider.death";
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  76 */     a("mob.spider.step", 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   protected void a(sa paramsa, float paramFloat)
/*     */   {
/*  81 */     float f1 = d(1.0F);
/*  82 */     if ((f1 > 0.5F) && (this.Z.nextInt(100) == 0)) {
/*  83 */       this.bm = null;
/*  84 */       return;
/*     */     }
/*     */     
/*  87 */     if ((paramFloat > 2.0F) && (paramFloat < 6.0F) && (this.Z.nextInt(10) == 0)) {
/*  88 */       if (this.D) {
/*  89 */         double d1 = paramsa.s - this.s;
/*  90 */         double d2 = paramsa.u - this.u;
/*  91 */         float f2 = qh.a(d1 * d1 + d2 * d2);
/*  92 */         this.v = (d1 / f2 * 0.5D * 0.800000011920929D + this.v * 0.20000000298023224D);
/*  93 */         this.x = (d2 / f2 * 0.5D * 0.800000011920929D + this.x * 0.20000000298023224D);
/*  94 */         this.w = 0.4000000059604645D;
/*     */       }
/*     */     } else {
/*  97 */       super.a(paramsa, paramFloat);
/*     */     }
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/* 103 */     return ade.F;
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 108 */     super.b(paramBoolean, paramInt);
/*     */     
/* 110 */     if ((paramBoolean) && ((this.Z.nextInt(3) == 0) || (this.Z.nextInt(1 + paramInt) > 0))) {
/* 111 */       a(ade.bp, 1);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean h_()
/*     */   {
/* 121 */     return bZ();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void as() {}
/*     */   
/*     */ 
/*     */   public sz bd()
/*     */   {
/* 131 */     return sz.c;
/*     */   }
/*     */   
/*     */   public boolean d(rw paramrw)
/*     */   {
/* 136 */     if (paramrw.a() == rv.u.H) {
/* 137 */       return false;
/*     */     }
/* 139 */     return super.d(paramrw);
/*     */   }
/*     */   
/*     */   public boolean bZ() {
/* 143 */     return (this.af.a(16) & 0x1) != 0;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 147 */     byte b = this.af.a(16);
/* 148 */     if (paramBoolean) {
/* 149 */       b = (byte)(b | 0x1);
/*     */     } else {
/* 151 */       b = (byte)(b & 0xFFFFFFFE);
/*     */     }
/* 153 */     this.af.b(16, Byte.valueOf(b));
/*     */   }
/*     */   
/*     */   public sy a(sy paramsy)
/*     */   {
/* 158 */     paramsy = super.a(paramsy);
/*     */     
/* 160 */     if (this.o.s.nextInt(100) == 0) {
/* 161 */       yl localyl = new yl(this.o);
/* 162 */       localyl.b(this.s, this.t, this.u, this.y, 0.0F);
/* 163 */       localyl.a(null);
/* 164 */       this.o.d(localyl);
/* 165 */       localyl.a(this);
/*     */     }
/*     */     
/* 168 */     if (paramsy == null) {
/* 169 */       paramsy = new yo();
/*     */       
/* 171 */       if ((this.o.r == rd.d) && (this.o.s.nextFloat() < 0.1F * this.o.b(this.s, this.t, this.u))) {
/* 172 */         ((yo)paramsy).a(this.o.s);
/*     */       }
/*     */     }
/* 175 */     if ((paramsy instanceof yo)) {
/* 176 */       int i = ((yo)paramsy).a;
/* 177 */       if ((i > 0) && (rv.a[i] != null)) {
/* 178 */         c(new rw(i, Integer.MAX_VALUE));
/*     */       }
/*     */     }
/*     */     
/* 182 */     return paramsy;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */