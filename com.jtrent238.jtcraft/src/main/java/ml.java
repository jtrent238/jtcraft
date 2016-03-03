/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ml
/*     */   extends mx
/*     */ {
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   private int e;
/*     */   private int f;
/*     */   
/*     */   public ml(ahb paramahb)
/*     */   {
/*  20 */     super(paramahb);
/*     */   }
/*     */   
/*     */   public void a()
/*     */   {
/*  25 */     super.a();
/*  26 */     this.f += 1;
/*     */     
/*  28 */     long l1 = this.a.I();
/*  29 */     long l2 = l1 / 24000L + 1L;
/*     */     
/*  31 */     if ((!this.c) && (this.f > 20)) {
/*  32 */       this.c = true;
/*  33 */       this.b.a.a(new gv(5, 0.0F));
/*     */     }
/*     */     
/*  36 */     this.d = (l1 > 120500L);
/*  37 */     if (this.d) {
/*  38 */       this.e += 1;
/*     */     }
/*     */     
/*  41 */     if (l1 % 24000L == 500L) {
/*  42 */       if (l2 <= 6L) {
/*  43 */         this.b.a(new fr("demo.day." + l2, new Object[0]));
/*     */       }
/*  45 */     } else if (l2 == 1L) {
/*  46 */       if (l1 == 100L) {
/*  47 */         this.b.a.a(new gv(5, 101.0F));
/*  48 */       } else if (l1 == 175L) {
/*  49 */         this.b.a.a(new gv(5, 102.0F));
/*  50 */       } else if (l1 == 250L) {
/*  51 */         this.b.a.a(new gv(5, 103.0F));
/*     */       }
/*  53 */     } else if ((l2 == 5L) && 
/*  54 */       (l1 % 24000L == 22000L)) {
/*  55 */       this.b.a(new fr("demo.day.warning", new Object[0]));
/*     */     }
/*     */   }
/*     */   
/*     */   private void e()
/*     */   {
/*  61 */     if (this.e > 100) {
/*  62 */       this.b.a(new fr("demo.reminder", new Object[0]));
/*  63 */       this.e = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  69 */     if (this.d) {
/*  70 */       e();
/*  71 */       return;
/*     */     }
/*  73 */     super.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  78 */     if (this.d) {
/*  79 */       return;
/*     */     }
/*  81 */     super.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  86 */     if (this.d) {
/*  87 */       return false;
/*     */     }
/*  89 */     return super.b(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz, ahb paramahb, add paramadd)
/*     */   {
/*  94 */     if (this.d) {
/*  95 */       e();
/*  96 */       return false;
/*     */     }
/*  98 */     return super.a(paramyz, paramahb, paramadd);
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz, ahb paramahb, add paramadd, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 103 */     if (this.d) {
/* 104 */       e();
/* 105 */       return false;
/*     */     }
/* 107 */     return super.a(paramyz, paramahb, paramadd, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */