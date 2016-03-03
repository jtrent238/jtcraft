/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class pz
/*     */ {
/*     */   private transient qa[] a;
/*     */   private transient int b;
/*     */   private int c;
/*     */   private final float d;
/*     */   private volatile transient int e;
/*  17 */   private Set f = new HashSet();
/*     */   
/*     */   public pz()
/*     */   {
/*  21 */     this.d = 0.75F;
/*  22 */     this.c = 12;
/*  23 */     this.a = new qa[16];
/*     */   }
/*     */   
/*     */   private static int g(int paramInt) {
/*  27 */     paramInt ^= paramInt >>> 20 ^ paramInt >>> 12;
/*  28 */     return paramInt ^ paramInt >>> 7 ^ paramInt >>> 4;
/*     */   }
/*     */   
/*     */   private static int a(int paramInt1, int paramInt2) {
/*  32 */     return paramInt1 & paramInt2 - 1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Object a(int paramInt)
/*     */   {
/*  44 */     int i = g(paramInt);
/*  45 */     for (qa localqa = this.a[a(i, this.a.length)]; localqa != null; localqa = localqa.c) {
/*  46 */       if (localqa.a == paramInt) return localqa.b;
/*     */     }
/*  48 */     return null;
/*     */   }
/*     */   
/*     */   public boolean b(int paramInt) {
/*  52 */     return c(paramInt) != null;
/*     */   }
/*     */   
/*     */   final qa c(int paramInt) {
/*  56 */     int i = g(paramInt);
/*  57 */     for (qa localqa = this.a[a(i, this.a.length)]; localqa != null; localqa = localqa.c) {
/*  58 */       if (localqa.a == paramInt) return localqa;
/*     */     }
/*  60 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, Object paramObject) {
/*  64 */     this.f.add(Integer.valueOf(paramInt));
/*  65 */     int i = g(paramInt);
/*  66 */     int j = a(i, this.a.length);
/*  67 */     for (qa localqa = this.a[j]; localqa != null; localqa = localqa.c) {
/*  68 */       if (localqa.a == paramInt) {
/*  69 */         localqa.b = paramObject;
/*  70 */         return;
/*     */       }
/*     */     }
/*     */     
/*  74 */     this.e += 1;
/*  75 */     a(i, paramInt, paramObject, j);
/*     */   }
/*     */   
/*     */   private void h(int paramInt)
/*     */   {
/*  80 */     qa[] arrayOfqa1 = this.a;
/*  81 */     int i = arrayOfqa1.length;
/*  82 */     if (i == 1073741824) {
/*  83 */       this.c = Integer.MAX_VALUE;
/*  84 */       return;
/*     */     }
/*     */     
/*  87 */     qa[] arrayOfqa2 = new qa[paramInt];
/*  88 */     a(arrayOfqa2);
/*  89 */     this.a = arrayOfqa2;
/*  90 */     this.c = ((int)(paramInt * this.d));
/*     */   }
/*     */   
/*     */   private void a(qa[] paramArrayOfqa) {
/*  94 */     qa[] arrayOfqa = this.a;
/*  95 */     int i = paramArrayOfqa.length;
/*  96 */     for (int j = 0; j < arrayOfqa.length; j++) {
/*  97 */       Object localObject = arrayOfqa[j];
/*  98 */       if (localObject != null) {
/*  99 */         arrayOfqa[j] = null;
/*     */         do {
/* 101 */           qa localqa = ((qa)localObject).c;
/* 102 */           int k = a(((qa)localObject).d, i);
/* 103 */           ((qa)localObject).c = paramArrayOfqa[k];
/* 104 */           paramArrayOfqa[k] = localObject;
/* 105 */           localObject = localqa;
/* 106 */         } while (localObject != null);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public Object d(int paramInt) {
/* 112 */     this.f.remove(Integer.valueOf(paramInt));
/* 113 */     qa localqa = e(paramInt);
/* 114 */     return localqa == null ? null : localqa.b;
/*     */   }
/*     */   
/*     */   final qa e(int paramInt) {
/* 118 */     int i = g(paramInt);
/* 119 */     int j = a(i, this.a.length);
/* 120 */     Object localObject1 = this.a[j];
/* 121 */     Object localObject2 = localObject1;
/*     */     
/* 123 */     while (localObject2 != null) {
/* 124 */       qa localqa = ((qa)localObject2).c;
/* 125 */       if (((qa)localObject2).a == paramInt) {
/* 126 */         this.e += 1;
/* 127 */         this.b -= 1;
/* 128 */         if (localObject1 == localObject2) this.a[j] = localqa; else
/* 129 */           ((qa)localObject1).c = localqa;
/* 130 */         return (qa)localObject2;
/*     */       }
/* 132 */       localObject1 = localObject2;
/* 133 */       localObject2 = localqa;
/*     */     }
/*     */     
/* 136 */     return (qa)localObject2;
/*     */   }
/*     */   
/*     */   public void c() {
/* 140 */     this.e += 1;
/* 141 */     qa[] arrayOfqa = this.a;
/* 142 */     for (int i = 0; i < arrayOfqa.length; i++)
/* 143 */       arrayOfqa[i] = null;
/* 144 */     this.b = 0;
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
/*     */   private void a(int paramInt1, int paramInt2, Object paramObject, int paramInt3)
/*     */   {
/* 221 */     qa localqa = this.a[paramInt3];
/* 222 */     this.a[paramInt3] = new qa(paramInt1, paramInt2, paramObject, localqa);
/* 223 */     if (this.b++ >= this.c) h(2 * this.a.length);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\pz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */