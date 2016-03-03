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
/*     */ public abstract class rx
/*     */   extends td
/*     */ {
/*     */   public rx(ahb paramahb)
/*     */   {
/*  17 */     super(paramahb);
/*     */   }
/*     */   
/*     */   public abstract rx a(rx paramrx);
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/*  24 */     add localadd = paramyz.bm.h();
/*     */     
/*  26 */     if ((localadd != null) && (localadd.b() == ade.bx)) {
/*  27 */       if (!this.o.E) {
/*  28 */         Class localClass = sg.a(localadd.k());
/*  29 */         if ((localClass != null) && (localClass.isAssignableFrom(getClass()))) {
/*  30 */           rx localrx = a(this);
/*  31 */           if (localrx != null) {
/*  32 */             localrx.c(41536);
/*  33 */             localrx.b(this.s, this.t, this.u, 0.0F, 0.0F);
/*     */             
/*  35 */             this.o.d(localrx);
/*     */             
/*  37 */             if (localadd.u()) {
/*  38 */               localrx.a(localadd.s());
/*     */             }
/*     */             
/*  41 */             if (!paramyz.bE.d) {
/*  42 */               localadd.b -= 1;
/*     */               
/*  44 */               if (localadd.b <= 0) {
/*  45 */                 paramyz.bm.a(paramyz.bm.c, null);
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*  51 */       return true;
/*     */     }
/*     */     
/*  54 */     return false;
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  59 */     super.c();
/*  60 */     this.af.a(12, new Integer(0));
/*     */   }
/*     */   
/*     */   public int d() {
/*  64 */     return this.af.c(12);
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/*  68 */     int i = d();
/*  69 */     i += paramInt * 20;
/*  70 */     if (i > 0) {
/*  71 */       i = 0;
/*     */     }
/*  73 */     c(i);
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/*  77 */     this.af.b(12, Integer.valueOf(paramInt));
/*  78 */     a(f());
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/*  83 */     super.b(paramdh);
/*  84 */     paramdh.a("Age", d());
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/*  89 */     super.a(paramdh);
/*  90 */     c(paramdh.f("Age"));
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  95 */     super.e();
/*     */     
/*  97 */     if (this.o.E) {
/*  98 */       a(f());
/*     */     } else {
/* 100 */       int i = d();
/* 101 */       if (i < 0) {
/* 102 */         i++;
/* 103 */         c(i);
/* 104 */       } else if (i > 0) {
/* 105 */         i--;
/* 106 */         c(i);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean f()
/*     */   {
/* 113 */     return d() < 0;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 117 */     a(paramBoolean ? 0.5F : 1.0F);
/*     */   }
/*     */   
/* 120 */   private float bp = -1.0F;
/*     */   private float bq;
/*     */   
/*     */   protected final void a(float paramFloat1, float paramFloat2)
/*     */   {
/* 125 */     int i = this.bp > 0.0F ? 1 : 0;
/*     */     
/* 127 */     this.bp = paramFloat1;
/* 128 */     this.bq = paramFloat2;
/*     */     
/* 130 */     if (i == 0) {
/* 131 */       a(1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   protected final void a(float paramFloat) {
/* 136 */     super.a(this.bp * paramFloat, this.bq * paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\rx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */