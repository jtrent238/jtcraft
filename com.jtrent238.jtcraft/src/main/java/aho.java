/*     */ import java.lang.reflect.Constructor;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
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
/*     */ public final class aho
/*     */ {
/*     */   protected static agt a(ahb paramahb, int paramInt1, int paramInt2)
/*     */   {
/*  21 */     apx localapx = paramahb.e(paramInt1, paramInt2);
/*  22 */     int i = paramInt1 * 16 + paramahb.s.nextInt(16);
/*  23 */     int j = paramInt2 * 16 + paramahb.s.nextInt(16);
/*  24 */     int k = paramahb.s.nextInt(localapx == null ? paramahb.S() : localapx.h() + 16 - 1);
/*     */     
/*  26 */     return new agt(i, k, j);
/*     */   }
/*     */   
/*  29 */   private HashMap a = new HashMap();
/*     */   
/*     */   public int a(mt parammt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/*  32 */     if ((!paramBoolean1) && (!paramBoolean2)) {
/*  33 */       return 0;
/*     */     }
/*     */     
/*  36 */     this.a.clear();
/*     */     int k;
/*  38 */     int m; Object localObject2; for (int i = 0; i < parammt.h.size(); i++) {
/*  39 */       localObject1 = (yz)parammt.h.get(i);
/*  40 */       int j = qh.c(((yz)localObject1).s / 16.0D);
/*  41 */       k = qh.c(((yz)localObject1).u / 16.0D);
/*     */       
/*  43 */       m = 8;
/*  44 */       for (int n = -m; n <= m; n++) {
/*  45 */         for (int i1 = -m; i1 <= m; i1++) {
/*  46 */           int i2 = (n == -m) || (n == m) || (i1 == -m) || (i1 == m) ? 1 : 0;
/*  47 */           localObject2 = new agu(n + j, i1 + k);
/*  48 */           if (i2 == 0) {
/*  49 */             this.a.put(localObject2, Boolean.valueOf(false));
/*  50 */           } else if (!this.a.containsKey(localObject2))
/*     */           {
/*  52 */             this.a.put(localObject2, Boolean.valueOf(true));
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*  57 */     i = 0;
/*  58 */     Object localObject1 = parammt.K();
/*     */     sx localsx;
/*  60 */     label858: label864: for (localsx : sx.values())
/*     */     {
/*  62 */       if (((!localsx.d()) || (paramBoolean2)) && ((localsx.d()) || (paramBoolean1)) && ((!localsx.e()) || (paramBoolean3)))
/*     */       {
/*     */ 
/*     */ 
/*  66 */         if (parammt.a(localsx.a()) <= localsx.b() * this.a.size() / 256)
/*     */         {
/*     */ 
/*     */ 
/*  70 */           for (agu localagu : this.a.keySet())
/*     */           {
/*  72 */             if (!((Boolean)this.a.get(localagu)).booleanValue())
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*  77 */               localObject2 = a(parammt, localagu.a, localagu.b);
/*  78 */               int i3 = ((agt)localObject2).a;
/*  79 */               int i4 = ((agt)localObject2).b;
/*  80 */               int i5 = ((agt)localObject2).c;
/*     */               
/*  82 */               if ((!parammt.a(i3, i4, i5).r()) && 
/*  83 */                 (parammt.a(i3, i4, i5).o() == localsx.c()))
/*     */               {
/*  85 */                 int i6 = 0;
/*     */                 
/*  87 */                 for (int i7 = 0;; i7++) { if (i7 >= 3) break label864;
/*  88 */                   int i8 = i3;
/*  89 */                   int i9 = i4;
/*  90 */                   int i10 = i5;
/*  91 */                   int i11 = 6;
/*     */                   
/*  93 */                   ahx localahx = null;
/*  94 */                   sy localsy = null;
/*     */                   
/*  96 */                   for (int i12 = 0;; i12++) { if (i12 >= 4) break label858;
/*  97 */                     i8 += parammt.s.nextInt(i11) - parammt.s.nextInt(i11);
/*  98 */                     i9 += parammt.s.nextInt(1) - parammt.s.nextInt(1);
/*  99 */                     i10 += parammt.s.nextInt(i11) - parammt.s.nextInt(i11);
/*     */                     
/* 101 */                     if (a(localsx, parammt, i8, i9, i10)) {
/* 102 */                       float f1 = i8 + 0.5F;
/* 103 */                       float f2 = i9;
/* 104 */                       float f3 = i10 + 0.5F;
/* 105 */                       if (parammt.a(f1, f2, f3, 24.0D) == null)
/*     */                       {
/*     */ 
/* 108 */                         float f4 = f1 - ((r)localObject1).a;
/* 109 */                         float f5 = f2 - ((r)localObject1).b;
/* 110 */                         float f6 = f3 - ((r)localObject1).c;
/* 111 */                         float f7 = f4 * f4 + f5 * f5 + f6 * f6;
/* 112 */                         if (f7 >= 576.0F)
/*     */                         {
/*     */ 
/*     */ 
/*     */ 
/* 117 */                           if (localahx == null) {
/* 118 */                             localahx = parammt.a(localsx, i8, i9, i10);
/* 119 */                             if (localahx == null) {
/*     */                               break label858;
/*     */                             }
/*     */                           }
/*     */                           sw localsw;
/*     */                           try
/*     */                           {
/* 126 */                             localsw = (sw)localahx.b.getConstructor(new Class[] { ahb.class }).newInstance(new Object[] { parammt });
/*     */                           } catch (Exception localException) {
/* 128 */                             localException.printStackTrace();
/* 129 */                             return i;
/*     */                           }
/*     */                           
/* 132 */                           localsw.b(f1, f2, f3, parammt.s.nextFloat() * 360.0F, 0.0F);
/*     */                           
/* 134 */                           if (localsw.by()) {
/* 135 */                             i6++;
/* 136 */                             parammt.d(localsw);
/* 137 */                             localsy = localsw.a(localsy);
/* 138 */                             if (i6 >= localsw.bB()) break;
/*     */                           }
/* 140 */                           i += i6;
/*     */                         }
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                 } } } } } } }
/* 146 */     return i;
/*     */   }
/*     */   
/*     */   public static boolean a(sx paramsx, ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 150 */     if (paramsx.c() == awt.h) {
/* 151 */       return (paramahb.a(paramInt1, paramInt2, paramInt3).o().d()) && (paramahb.a(paramInt1, paramInt2 - 1, paramInt3).o().d()) && (!paramahb.a(paramInt1, paramInt2 + 1, paramInt3).r());
/*     */     }
/* 153 */     if (!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) return false;
/* 154 */     aji localaji = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/* 155 */     return (localaji != ajn.h) && (!paramahb.a(paramInt1, paramInt2, paramInt3).r()) && (!paramahb.a(paramInt1, paramInt2, paramInt3).o().d()) && (!paramahb.a(paramInt1, paramInt2 + 1, paramInt3).r());
/*     */   }
/*     */   
/*     */ 
/*     */   public static void a(ahb paramahb, ahu paramahu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom)
/*     */   {
/* 161 */     List localList = paramahu.a(sx.b);
/* 162 */     if (localList.isEmpty()) {
/* 163 */       return;
/*     */     }
/*     */     
/* 166 */     while (paramRandom.nextFloat() < paramahu.g())
/*     */     {
/* 168 */       ahx localahx = (ahx)qv.a(paramahb.s, localList);
/* 169 */       sy localsy = null;
/* 170 */       int i = localahx.c + paramRandom.nextInt(1 + localahx.d - localahx.c);
/*     */       
/* 172 */       int j = paramInt1 + paramRandom.nextInt(paramInt3);
/* 173 */       int k = paramInt2 + paramRandom.nextInt(paramInt4);
/* 174 */       int m = j;int n = k;
/*     */       
/* 176 */       for (int i1 = 0; i1 < i; i1++) {
/* 177 */         int i2 = 0;
/* 178 */         for (int i3 = 0; (i2 == 0) && (i3 < 4); i3++)
/*     */         {
/* 180 */           int i4 = paramahb.i(j, k);
/* 181 */           if (a(sx.b, paramahb, j, i4, k))
/*     */           {
/* 183 */             float f1 = j + 0.5F;
/* 184 */             float f2 = i4;
/* 185 */             float f3 = k + 0.5F;
/*     */             sw localsw;
/*     */             try
/*     */             {
/* 189 */               localsw = (sw)localahx.b.getConstructor(new Class[] { ahb.class }).newInstance(new Object[] { paramahb });
/*     */             } catch (Exception localException) {
/* 191 */               localException.printStackTrace();
/* 192 */               continue;
/*     */             }
/*     */             
/* 195 */             localsw.b(f1, f2, f3, paramRandom.nextFloat() * 360.0F, 0.0F);
/*     */             
/* 197 */             paramahb.d(localsw);
/* 198 */             localsy = localsw.a(localsy);
/* 199 */             i2 = 1;
/*     */           }
/*     */           
/* 202 */           j += paramRandom.nextInt(5) - paramRandom.nextInt(5);
/* 203 */           k += paramRandom.nextInt(5) - paramRandom.nextInt(5);
/* 204 */           while ((j < paramInt1) || (j >= paramInt1 + paramInt3) || (k < paramInt2) || (k >= paramInt2 + paramInt3)) {
/* 205 */             j = m + paramRandom.nextInt(5) - paramRandom.nextInt(5);
/* 206 */             k = n + paramRandom.nextInt(5) - paramRandom.nextInt(5);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */