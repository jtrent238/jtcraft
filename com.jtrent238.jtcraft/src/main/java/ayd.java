/*     */ 
/*     */ public class ayd
/*     */ {
/*   4 */   private aye[] a = new aye['Ѐ'];
/*     */   private int b;
/*     */   
/*     */   public aye a(aye paramaye)
/*     */   {
/*   9 */     if (paramaye.d >= 0) { throw new IllegalStateException("OW KNOWS!");
/*     */     }
/*  11 */     if (this.b == this.a.length) {
/*  12 */       aye[] arrayOfaye = new aye[this.b << 1];
/*  13 */       System.arraycopy(this.a, 0, arrayOfaye, 0, this.b);
/*  14 */       this.a = arrayOfaye;
/*     */     }
/*     */     
/*     */ 
/*  18 */     this.a[this.b] = paramaye;
/*  19 */     paramaye.d = this.b;
/*  20 */     a(this.b++);
/*     */     
/*  22 */     return paramaye;
/*     */   }
/*     */   
/*     */   public void a() {
/*  26 */     this.b = 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public aye c()
/*     */   {
/*  34 */     aye localaye = this.a[0];
/*  35 */     this.a[0] = this.a[(--this.b)];
/*  36 */     this.a[this.b] = null;
/*  37 */     if (this.b > 0) b(0);
/*  38 */     localaye.d = -1;
/*  39 */     return localaye;
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(aye paramaye, float paramFloat)
/*     */   {
/*  58 */     float f = paramaye.g;
/*  59 */     paramaye.g = paramFloat;
/*  60 */     if (paramFloat < f) {
/*  61 */       a(paramaye.d);
/*     */     } else {
/*  63 */       b(paramaye.d);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private void a(int paramInt)
/*     */   {
/*  72 */     aye localaye1 = this.a[paramInt];
/*  73 */     float f = localaye1.g;
/*  74 */     while (paramInt > 0) {
/*  75 */       int i = paramInt - 1 >> 1;
/*  76 */       aye localaye2 = this.a[i];
/*  77 */       if (f >= localaye2.g) break;
/*  78 */       this.a[paramInt] = localaye2;
/*  79 */       localaye2.d = paramInt;
/*  80 */       paramInt = i;
/*     */     }
/*     */     
/*  83 */     this.a[paramInt] = localaye1;
/*  84 */     localaye1.d = paramInt;
/*     */   }
/*     */   
/*     */   private void b(int paramInt) {
/*  88 */     aye localaye1 = this.a[paramInt];
/*  89 */     float f1 = localaye1.g;
/*     */     for (;;)
/*     */     {
/*  92 */       int i = 1 + (paramInt << 1);
/*  93 */       int j = i + 1;
/*     */       
/*  95 */       if (i >= this.b) {
/*     */         break;
/*     */       }
/*  98 */       aye localaye2 = this.a[i];
/*  99 */       float f2 = localaye2.g;
/*     */       
/*     */       aye localaye3;
/*     */       
/*     */       float f3;
/* 104 */       if (j >= this.b)
/*     */       {
/* 106 */         localaye3 = null;
/* 107 */         f3 = Float.POSITIVE_INFINITY;
/*     */       } else {
/* 109 */         localaye3 = this.a[j];
/* 110 */         f3 = localaye3.g;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/* 115 */       if (f2 < f3) {
/* 116 */         if (f2 >= f1) break;
/* 117 */         this.a[paramInt] = localaye2;
/* 118 */         localaye2.d = paramInt;
/* 119 */         paramInt = i;
/*     */       }
/*     */       else {
/* 122 */         if (f3 >= f1) break;
/* 123 */         this.a[paramInt] = localaye3;
/* 124 */         localaye3.d = paramInt;
/* 125 */         paramInt = j;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 130 */     this.a[paramInt] = localaye1;
/* 131 */     localaye1.d = paramInt;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 135 */     return this.b == 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ayd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */