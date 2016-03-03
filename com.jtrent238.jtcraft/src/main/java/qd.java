/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class qd
/*     */ {
/*     */   private transient qe[] a;
/*     */   private transient int b;
/*     */   private int c;
/*     */   private final float d;
/*     */   private volatile transient int e;
/*     */   
/*     */   public qd()
/*     */   {
/*  18 */     this.d = 0.75F;
/*  19 */     this.c = 12;
/*  20 */     this.a = new qe[16];
/*     */   }
/*     */   
/*     */   private static int g(long paramLong) {
/*  24 */     return a((int)(paramLong ^ paramLong >>> 32));
/*     */   }
/*     */   
/*     */   private static int a(int paramInt) {
/*  28 */     paramInt ^= paramInt >>> 20 ^ paramInt >>> 12;
/*  29 */     return paramInt ^ paramInt >>> 7 ^ paramInt >>> 4;
/*     */   }
/*     */   
/*     */   private static int a(int paramInt1, int paramInt2) {
/*  33 */     return paramInt1 & paramInt2 - 1;
/*     */   }
/*     */   
/*     */   public int a() {
/*  37 */     return this.b;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public Object a(long paramLong)
/*     */   {
/*  45 */     int i = g(paramLong);
/*  46 */     for (qe localqe = this.a[a(i, this.a.length)]; localqe != null; localqe = localqe.c) {
/*  47 */       if (localqe.a == paramLong) return localqe.b;
/*     */     }
/*  49 */     return null;
/*     */   }
/*     */   
/*     */   public boolean b(long paramLong) {
/*  53 */     return c(paramLong) != null;
/*     */   }
/*     */   
/*     */   final qe c(long paramLong) {
/*  57 */     int i = g(paramLong);
/*  58 */     for (qe localqe = this.a[a(i, this.a.length)]; localqe != null; localqe = localqe.c) {
/*  59 */       if (localqe.a == paramLong) return localqe;
/*     */     }
/*  61 */     return null;
/*     */   }
/*     */   
/*     */   public void a(long paramLong, Object paramObject) {
/*  65 */     int i = g(paramLong);
/*  66 */     int j = a(i, this.a.length);
/*  67 */     for (qe localqe = this.a[j]; localqe != null; localqe = localqe.c) {
/*  68 */       if (localqe.a == paramLong) {
/*  69 */         localqe.b = paramObject;
/*  70 */         return;
/*     */       }
/*     */     }
/*     */     
/*  74 */     this.e += 1;
/*  75 */     a(i, paramLong, paramObject, j);
/*     */   }
/*     */   
/*     */   private void b(int paramInt)
/*     */   {
/*  80 */     qe[] arrayOfqe1 = this.a;
/*  81 */     int i = arrayOfqe1.length;
/*  82 */     if (i == 1073741824) {
/*  83 */       this.c = Integer.MAX_VALUE;
/*  84 */       return;
/*     */     }
/*     */     
/*  87 */     qe[] arrayOfqe2 = new qe[paramInt];
/*  88 */     a(arrayOfqe2);
/*  89 */     this.a = arrayOfqe2;
/*  90 */     this.c = ((int)(paramInt * this.d));
/*     */   }
/*     */   
/*     */   private void a(qe[] paramArrayOfqe) {
/*  94 */     qe[] arrayOfqe = this.a;
/*  95 */     int i = paramArrayOfqe.length;
/*  96 */     for (int j = 0; j < arrayOfqe.length; j++) {
/*  97 */       Object localObject = arrayOfqe[j];
/*  98 */       if (localObject != null) {
/*  99 */         arrayOfqe[j] = null;
/*     */         do {
/* 101 */           qe localqe = ((qe)localObject).c;
/* 102 */           int k = a(((qe)localObject).d, i);
/* 103 */           ((qe)localObject).c = paramArrayOfqe[k];
/* 104 */           paramArrayOfqe[k] = localObject;
/* 105 */           localObject = localqe;
/* 106 */         } while (localObject != null);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public Object d(long paramLong) {
/* 112 */     qe localqe = e(paramLong);
/* 113 */     return localqe == null ? null : localqe.b;
/*     */   }
/*     */   
/*     */   final qe e(long paramLong) {
/* 117 */     int i = g(paramLong);
/* 118 */     int j = a(i, this.a.length);
/* 119 */     Object localObject1 = this.a[j];
/* 120 */     Object localObject2 = localObject1;
/*     */     
/* 122 */     while (localObject2 != null) {
/* 123 */       qe localqe = ((qe)localObject2).c;
/* 124 */       if (((qe)localObject2).a == paramLong) {
/* 125 */         this.e += 1;
/* 126 */         this.b -= 1;
/* 127 */         if (localObject1 == localObject2) this.a[j] = localqe; else
/* 128 */           ((qe)localObject1).c = localqe;
/* 129 */         return (qe)localObject2;
/*     */       }
/* 131 */       localObject1 = localObject2;
/* 132 */       localObject2 = localqe;
/*     */     }
/*     */     
/* 135 */     return (qe)localObject2;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void a(int paramInt1, long paramLong, Object paramObject, int paramInt2)
/*     */   {
/* 220 */     qe localqe = this.a[paramInt2];
/* 221 */     this.a[paramInt2] = new qe(paramInt1, paramLong, paramObject, localqe);
/* 222 */     if (this.b++ >= this.c) b(2 * this.a.length);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */