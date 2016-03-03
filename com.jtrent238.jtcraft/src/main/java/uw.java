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
/*     */ public class uw
/*     */   extends ui
/*     */ {
/*     */   private final wn a;
/*     */   private final double b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   
/*     */   public uw(wn paramwn, double paramDouble)
/*     */   {
/*  26 */     this.a = paramwn;
/*  27 */     this.b = paramDouble;
/*  28 */     a(5);
/*     */   }
/*     */   
/*     */   public boolean a()
/*     */   {
/*  33 */     return (this.a.bZ()) && (!this.a.ca()) && (this.a.aI().nextDouble() <= 0.006500000134110451D) && (f());
/*     */   }
/*     */   
/*     */   public boolean b()
/*     */   {
/*  38 */     return (this.c <= this.e) && (this.d <= 60) && (a(this.a.o, this.f, this.g, this.h));
/*     */   }
/*     */   
/*     */   public void c()
/*     */   {
/*  43 */     this.a.m().a(this.f + 0.5D, this.g + 1, this.h + 0.5D, this.b);
/*  44 */     this.c = 0;
/*  45 */     this.d = 0;
/*  46 */     this.e = (this.a.aI().nextInt(this.a.aI().nextInt(1200) + 1200) + 1200);
/*  47 */     this.a.cc().a(false);
/*     */   }
/*     */   
/*     */   public void d()
/*     */   {
/*  52 */     this.a.k(false);
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  57 */     this.c += 1;
/*  58 */     this.a.cc().a(false);
/*  59 */     if (this.a.e(this.f, this.g + 1, this.h) > 1.0D) {
/*  60 */       this.a.k(false);
/*  61 */       this.a.m().a(this.f + 0.5D, this.g + 1, this.h + 0.5D, this.b);
/*  62 */       this.d += 1;
/*  63 */     } else if (!this.a.ca()) {
/*  64 */       this.a.k(true);
/*     */     } else {
/*  66 */       this.d -= 1;
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean f() {
/*  71 */     int i = (int)this.a.t;
/*  72 */     double d1 = 2.147483647E9D;
/*     */     
/*  74 */     for (int j = (int)this.a.s - 8; j < this.a.s + 8.0D; j++) {
/*  75 */       for (int k = (int)this.a.u - 8; k < this.a.u + 8.0D; k++) {
/*  76 */         if ((a(this.a.o, j, i, k)) && (this.a.o.c(j, i + 1, k))) {
/*  77 */           double d2 = this.a.e(j, i, k);
/*     */           
/*  79 */           if (d2 < d1) {
/*  80 */             this.f = j;
/*  81 */             this.g = i;
/*  82 */             this.h = k;
/*  83 */             d1 = d2;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  89 */     return d1 < 2.147483647E9D;
/*     */   }
/*     */   
/*     */   private boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  93 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*  94 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  96 */     if (localaji == ajn.ae) {
/*  97 */       aow localaow = (aow)paramahb.o(paramInt1, paramInt2, paramInt3);
/*     */       
/*  99 */       if (localaow.o < 1)
/* 100 */         return true;
/*     */     } else {
/* 102 */       if (localaji == ajn.am)
/* 103 */         return true;
/* 104 */       if ((localaji == ajn.C) && (!ajh.b(i))) {
/* 105 */         return true;
/*     */       }
/*     */     }
/* 108 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\uw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */