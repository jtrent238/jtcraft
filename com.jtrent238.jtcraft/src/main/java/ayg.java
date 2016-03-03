/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ayg
/*     */ {
/*     */   private ahl a;
/*  13 */   private ayd b = new ayd();
/*  14 */   private pz c = new pz();
/*     */   
/*  16 */   private aye[] d = new aye[32];
/*     */   private boolean e;
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   private boolean h;
/*     */   
/*     */   public ayg(ahl paramahl, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
/*     */   {
/*  24 */     this.a = paramahl;
/*  25 */     this.e = paramBoolean1;
/*  26 */     this.f = paramBoolean2;
/*  27 */     this.g = paramBoolean3;
/*  28 */     this.h = paramBoolean4;
/*     */   }
/*     */   
/*     */   public ayf a(sa paramsa1, sa paramsa2, float paramFloat) {
/*  32 */     return a(paramsa1, paramsa2.s, paramsa2.C.b, paramsa2.u, paramFloat);
/*     */   }
/*     */   
/*     */   public ayf a(sa paramsa, int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
/*  36 */     return a(paramsa, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, paramFloat);
/*     */   }
/*     */   
/*     */   private ayf a(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*  40 */     this.b.a();
/*  41 */     this.c.c();
/*     */     
/*  43 */     boolean bool = this.g;
/*  44 */     int i = qh.c(paramsa.C.b + 0.5D);
/*  45 */     if ((this.h) && (paramsa.M())) {
/*  46 */       i = (int)paramsa.C.b;
/*  47 */       localObject = this.a.a(qh.c(paramsa.s), i, qh.c(paramsa.u));
/*  48 */       while ((localObject == ajn.i) || (localObject == ajn.j)) {
/*  49 */         i++;
/*  50 */         localObject = this.a.a(qh.c(paramsa.s), i, qh.c(paramsa.u));
/*     */       }
/*  52 */       bool = this.g;
/*  53 */       this.g = false;
/*  54 */     } else { i = qh.c(paramsa.C.b + 0.5D);
/*     */     }
/*  56 */     Object localObject = a(qh.c(paramsa.C.a), i, qh.c(paramsa.C.c));
/*  57 */     aye localaye1 = a(qh.c(paramDouble1 - paramsa.M / 2.0F), qh.c(paramDouble2), qh.c(paramDouble3 - paramsa.M / 2.0F));
/*     */     
/*  59 */     aye localaye2 = new aye(qh.d(paramsa.M + 1.0F), qh.d(paramsa.N + 1.0F), qh.d(paramsa.M + 1.0F));
/*  60 */     ayf localayf = a(paramsa, (aye)localObject, localaye1, localaye2, paramFloat);
/*     */     
/*  62 */     this.g = bool;
/*  63 */     return localayf;
/*     */   }
/*     */   
/*     */   private ayf a(sa paramsa, aye paramaye1, aye paramaye2, aye paramaye3, float paramFloat)
/*     */   {
/*  68 */     paramaye1.e = 0.0F;
/*  69 */     paramaye1.f = paramaye1.b(paramaye2);
/*  70 */     paramaye1.g = paramaye1.f;
/*     */     
/*  72 */     this.b.a();
/*  73 */     this.b.a(paramaye1);
/*     */     
/*  75 */     Object localObject = paramaye1;
/*     */     
/*  77 */     while (!this.b.e()) {
/*  78 */       aye localaye1 = this.b.c();
/*     */       
/*  80 */       if (localaye1.equals(paramaye2)) {
/*  81 */         return a(paramaye1, paramaye2);
/*     */       }
/*     */       
/*  84 */       if (localaye1.b(paramaye2) < ((aye)localObject).b(paramaye2)) {
/*  85 */         localObject = localaye1;
/*     */       }
/*  87 */       localaye1.i = true;
/*     */       
/*  89 */       int i = b(paramsa, localaye1, paramaye3, paramaye2, paramFloat);
/*  90 */       for (int j = 0; j < i; j++) {
/*  91 */         aye localaye2 = this.d[j];
/*     */         
/*  93 */         float f1 = localaye1.e + localaye1.b(localaye2);
/*  94 */         if ((!localaye2.a()) || (f1 < localaye2.e)) {
/*  95 */           localaye2.h = localaye1;
/*  96 */           localaye2.e = f1;
/*  97 */           localaye2.f = localaye2.b(paramaye2);
/*  98 */           if (localaye2.a()) {
/*  99 */             this.b.a(localaye2, localaye2.e + localaye2.f);
/*     */           } else {
/* 101 */             localaye2.g = (localaye2.e + localaye2.f);
/* 102 */             this.b.a(localaye2);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 108 */     if (localObject == paramaye1) return null;
/* 109 */     return a(paramaye1, (aye)localObject);
/*     */   }
/*     */   
/*     */   private int b(sa paramsa, aye paramaye1, aye paramaye2, aye paramaye3, float paramFloat) {
/* 113 */     int i = 0;
/*     */     
/* 115 */     int j = 0;
/* 116 */     if (a(paramsa, paramaye1.a, paramaye1.b + 1, paramaye1.c, paramaye2) == 1) { j = 1;
/*     */     }
/* 118 */     aye localaye1 = a(paramsa, paramaye1.a, paramaye1.b, paramaye1.c + 1, paramaye2, j);
/* 119 */     aye localaye2 = a(paramsa, paramaye1.a - 1, paramaye1.b, paramaye1.c, paramaye2, j);
/* 120 */     aye localaye3 = a(paramsa, paramaye1.a + 1, paramaye1.b, paramaye1.c, paramaye2, j);
/* 121 */     aye localaye4 = a(paramsa, paramaye1.a, paramaye1.b, paramaye1.c - 1, paramaye2, j);
/*     */     
/* 123 */     if ((localaye1 != null) && (!localaye1.i) && (localaye1.a(paramaye3) < paramFloat)) this.d[(i++)] = localaye1;
/* 124 */     if ((localaye2 != null) && (!localaye2.i) && (localaye2.a(paramaye3) < paramFloat)) this.d[(i++)] = localaye2;
/* 125 */     if ((localaye3 != null) && (!localaye3.i) && (localaye3.a(paramaye3) < paramFloat)) this.d[(i++)] = localaye3;
/* 126 */     if ((localaye4 != null) && (!localaye4.i) && (localaye4.a(paramaye3) < paramFloat)) { this.d[(i++)] = localaye4;
/*     */     }
/* 128 */     return i;
/*     */   }
/*     */   
/*     */   private aye a(sa paramsa, int paramInt1, int paramInt2, int paramInt3, aye paramaye, int paramInt4) {
/* 132 */     aye localaye = null;
/* 133 */     int i = a(paramsa, paramInt1, paramInt2, paramInt3, paramaye);
/* 134 */     if (i == 2) return a(paramInt1, paramInt2, paramInt3);
/* 135 */     if (i == 1) localaye = a(paramInt1, paramInt2, paramInt3);
/* 136 */     if ((localaye == null) && (paramInt4 > 0) && (i != -3) && (i != -4) && (a(paramsa, paramInt1, paramInt2 + paramInt4, paramInt3, paramaye) == 1)) {
/* 137 */       localaye = a(paramInt1, paramInt2 + paramInt4, paramInt3);
/* 138 */       paramInt2 += paramInt4;
/*     */     }
/*     */     
/* 141 */     if (localaye != null) {
/* 142 */       int j = 0;
/* 143 */       int k = 0;
/*     */       
/* 145 */       while (paramInt2 > 0) {
/* 146 */         k = a(paramsa, paramInt1, paramInt2 - 1, paramInt3, paramaye);
/* 147 */         if ((this.g) && (k == -1)) return null;
/* 148 */         if (k != 1) {
/*     */           break;
/*     */         }
/* 151 */         if (j++ >= paramsa.ax()) return null;
/* 152 */         paramInt2--;
/* 153 */         if (paramInt2 > 0) { localaye = a(paramInt1, paramInt2, paramInt3);
/*     */         }
/*     */       }
/* 156 */       if (k == -2) { return null;
/*     */       }
/*     */     }
/* 159 */     return localaye;
/*     */   }
/*     */   
/*     */   private final aye a(int paramInt1, int paramInt2, int paramInt3) {
/* 163 */     int i = aye.a(paramInt1, paramInt2, paramInt3);
/* 164 */     aye localaye = (aye)this.c.a(i);
/* 165 */     if (localaye == null) {
/* 166 */       localaye = new aye(paramInt1, paramInt2, paramInt3);
/* 167 */       this.c.a(i, localaye);
/*     */     }
/* 169 */     return localaye;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int a(sa paramsa, int paramInt1, int paramInt2, int paramInt3, aye paramaye)
/*     */   {
/* 181 */     return a(paramsa, paramInt1, paramInt2, paramInt3, paramaye, this.g, this.f, this.e);
/*     */   }
/*     */   
/*     */   public static int a(sa paramsa, int paramInt1, int paramInt2, int paramInt3, aye paramaye, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/* 185 */     int i = 0;
/* 186 */     for (int j = paramInt1; j < paramInt1 + paramaye.a; j++)
/* 187 */       for (int k = paramInt2; k < paramInt2 + paramaye.b; k++)
/* 188 */         for (int m = paramInt3; m < paramInt3 + paramaye.c; m++)
/*     */         {
/* 190 */           aji localaji = paramsa.o.a(j, k, m);
/* 191 */           if (localaji.o() != awt.a) {
/* 192 */             if (localaji == ajn.aT) { i = 1;
/* 193 */             } else if ((localaji == ajn.i) || (localaji == ajn.j)) {
/* 194 */               if (paramBoolean1) return -1;
/* 195 */               i = 1;
/* 196 */             } else if ((!paramBoolean3) && (localaji == ajn.ao)) {
/* 197 */               return 0;
/*     */             }
/* 199 */             int n = localaji.b();
/*     */             
/* 201 */             if (paramsa.o.a(j, k, m).b() == 9) {
/* 202 */               int i1 = qh.c(paramsa.s);
/* 203 */               int i2 = qh.c(paramsa.t);
/* 204 */               int i3 = qh.c(paramsa.u);
/* 205 */               if ((paramsa.o.a(i1, i2, i3).b() != 9) && (paramsa.o.a(i1, i2 - 1, i3).b() != 9))
/*     */               {
/*     */ 
/*     */ 
/* 209 */                 return -3;
/*     */               }
/*     */               
/*     */             }
/* 213 */             else if ((!localaji.b(paramsa.o, j, k, m)) && (
/* 214 */               (!paramBoolean2) || (localaji != ajn.ao)))
/*     */             {
/* 216 */               if ((n == 11) || (localaji == ajn.be) || (n == 32)) { return -3;
/*     */               }
/* 218 */               if (localaji == ajn.aT) return -4;
/* 219 */               awt localawt = localaji.o();
/* 220 */               if (localawt == awt.i) {
/* 221 */                 if (!paramsa.P())
/* 222 */                   return -2;
/*     */               } else
/* 224 */                 return 0;
/*     */             }
/*     */           }
/*     */         }
/* 228 */     return i != 0 ? 2 : 1;
/*     */   }
/*     */   
/*     */   private ayf a(aye paramaye1, aye paramaye2)
/*     */   {
/* 233 */     int i = 1;
/* 234 */     aye localaye = paramaye2;
/* 235 */     while (localaye.h != null) {
/* 236 */       i++;
/* 237 */       localaye = localaye.h;
/*     */     }
/*     */     
/* 240 */     aye[] arrayOfaye = new aye[i];
/* 241 */     localaye = paramaye2;
/* 242 */     arrayOfaye[(--i)] = localaye;
/* 243 */     while (localaye.h != null) {
/* 244 */       localaye = localaye.h;
/* 245 */       arrayOfaye[(--i)] = localaye;
/*     */     }
/* 247 */     return new ayf(arrayOfaye);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ayg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */