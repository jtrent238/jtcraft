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
/*     */ public class aag
/*     */   extends zs
/*     */ {
/*  18 */   public rb a = new aah(this, "Enchant", true, 1);
/*     */   
/*     */ 
/*     */ 
/*     */   private ahb h;
/*     */   
/*     */ 
/*     */   private int i;
/*     */   
/*     */ 
/*     */   private int j;
/*     */   
/*     */ 
/*     */   private int k;
/*     */   
/*     */ 
/*  34 */   private Random l = new Random();
/*     */   
/*     */   public long f;
/*  37 */   public int[] g = new int[3];
/*     */   
/*     */   public aag(yx paramyx, ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  40 */     this.h = paramahb;
/*  41 */     this.i = paramInt1;
/*  42 */     this.j = paramInt2;
/*  43 */     this.k = paramInt3;
/*  44 */     a(new aai(this, this.a, 0, 25, 47));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  51 */     for (int m = 0; m < 3; m++) {
/*  52 */       for (int n = 0; n < 9; n++) {
/*  53 */         a(new aay(paramyx, n + m * 9 + 9, 8 + n * 18, 84 + m * 18));
/*     */       }
/*     */     }
/*  56 */     for (m = 0; m < 9; m++) {
/*  57 */       a(new aay(paramyx, m, 8 + m * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(aac paramaac)
/*     */   {
/*  63 */     super.a(paramaac);
/*     */     
/*  65 */     paramaac.a(this, 0, this.g[0]);
/*  66 */     paramaac.a(this, 1, this.g[1]);
/*  67 */     paramaac.a(this, 2, this.g[2]);
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  72 */     super.b();
/*     */     
/*  74 */     for (int m = 0; m < this.e.size(); m++) {
/*  75 */       aac localaac = (aac)this.e.get(m);
/*  76 */       localaac.a(this, 0, this.g[0]);
/*  77 */       localaac.a(this, 1, this.g[1]);
/*  78 */       localaac.a(this, 2, this.g[2]);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void b(int paramInt1, int paramInt2)
/*     */   {
/*  85 */     if ((paramInt1 >= 0) && (paramInt1 <= 2)) {
/*  86 */       this.g[paramInt1] = paramInt2;
/*     */     } else {
/*  88 */       super.b(paramInt1, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rb paramrb)
/*     */   {
/*  94 */     if (paramrb == this.a) {
/*  95 */       add localadd = paramrb.a(0);
/*     */       int m;
/*  97 */       if ((localadd == null) || (!localadd.x())) {
/*  98 */         for (m = 0; m < 3; m++) {
/*  99 */           this.g[m] = 0;
/*     */         }
/*     */       } else {
/* 102 */         this.f = this.l.nextLong();
/*     */         
/* 104 */         if (!this.h.E)
/*     */         {
/* 106 */           m = 0;
/* 107 */           for (int n = -1; n <= 1; n++) {
/* 108 */             for (int i1 = -1; i1 <= 1; i1++) {
/* 109 */               if ((n != 0) || (i1 != 0))
/*     */               {
/*     */ 
/*     */ 
/* 113 */                 if ((this.h.c(this.i + i1, this.j, this.k + n)) && (this.h.c(this.i + i1, this.j + 1, this.k + n))) {
/* 114 */                   if (this.h.a(this.i + i1 * 2, this.j, this.k + n * 2) == ajn.X) {
/* 115 */                     m++;
/*     */                   }
/* 117 */                   if (this.h.a(this.i + i1 * 2, this.j + 1, this.k + n * 2) == ajn.X) {
/* 118 */                     m++;
/*     */                   }
/*     */                   
/* 121 */                   if ((i1 != 0) && (n != 0)) {
/* 122 */                     if (this.h.a(this.i + i1 * 2, this.j, this.k + n) == ajn.X) {
/* 123 */                       m++;
/*     */                     }
/* 125 */                     if (this.h.a(this.i + i1 * 2, this.j + 1, this.k + n) == ajn.X) {
/* 126 */                       m++;
/*     */                     }
/* 128 */                     if (this.h.a(this.i + i1, this.j, this.k + n * 2) == ajn.X) {
/* 129 */                       m++;
/*     */                     }
/* 131 */                     if (this.h.a(this.i + i1, this.j + 1, this.k + n * 2) == ajn.X) {
/* 132 */                       m++;
/*     */                     }
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/* 139 */           for (n = 0; n < 3; n++) {
/* 140 */             this.g[n] = afv.a(this.l, n, m, localadd);
/*     */           }
/* 142 */           b();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz, int paramInt)
/*     */   {
/* 150 */     add localadd = this.a.a(0);
/* 151 */     if ((this.g[paramInt] > 0) && (localadd != null) && ((paramyz.bF >= this.g[paramInt]) || (paramyz.bE.d)))
/*     */     {
/* 153 */       if (!this.h.E) {
/* 154 */         List localList = afv.b(this.l, localadd, this.g[paramInt]);
/* 155 */         int m = localadd.b() == ade.aG ? 1 : 0;
/*     */         
/* 157 */         if (localList != null) {
/* 158 */           paramyz.a(-this.g[paramInt]);
/* 159 */           if (m != 0) localadd.a(ade.bR);
/* 160 */           int n = (m != 0) && (localList.size() > 1) ? this.l.nextInt(localList.size()) : -1;
/*     */           
/* 162 */           for (int i1 = 0; i1 < localList.size(); i1++) {
/* 163 */             agc localagc = (agc)localList.get(i1);
/* 164 */             if ((m == 0) || (i1 != n))
/*     */             {
/* 166 */               if (m != 0) {
/* 167 */                 ade.bR.a(localadd, localagc);
/*     */               } else {
/* 169 */                 localadd.a(localagc.b, localagc.c);
/*     */               }
/*     */             }
/*     */           }
/* 173 */           a(this.a);
/*     */         }
/*     */       }
/* 176 */       return true;
/*     */     }
/* 178 */     return false;
/*     */   }
/*     */   
/*     */   public void b(yz paramyz)
/*     */   {
/* 183 */     super.b(paramyz);
/* 184 */     if (this.h.E) { return;
/*     */     }
/* 186 */     add localadd = this.a.a_(0);
/* 187 */     if (localadd != null) {
/* 188 */       paramyz.a(localadd, false);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 194 */     if (this.h.a(this.i, this.j, this.k) != ajn.bn) return false;
/* 195 */     if (paramyz.e(this.i + 0.5D, this.j + 0.5D, this.k + 0.5D) > 64.0D) return false;
/* 196 */     return true;
/*     */   }
/*     */   
/*     */   public add b(yz paramyz, int paramInt)
/*     */   {
/* 201 */     add localadd1 = null;
/* 202 */     aay localaay = (aay)this.c.get(paramInt);
/* 203 */     if ((localaay != null) && (localaay.e())) {
/* 204 */       add localadd2 = localaay.d();
/* 205 */       localadd1 = localadd2.m();
/*     */       
/* 207 */       if (paramInt == 0) {
/* 208 */         if (!a(localadd2, 1, 37, true)) {
/* 209 */           return null;
/*     */         }
/* 211 */       } else if ((!((aay)this.c.get(0)).e()) && (((aay)this.c.get(0)).a(localadd2))) {
/* 212 */         if ((localadd2.p()) && (localadd2.b == 1)) {
/* 213 */           ((aay)this.c.get(0)).c(localadd2.m());
/* 214 */           localadd2.b = 0;
/* 215 */         } else if (localadd2.b >= 1) {
/* 216 */           ((aay)this.c.get(0)).c(new add(localadd2.b(), 1, localadd2.k()));
/* 217 */           localadd2.b -= 1;
/*     */         }
/*     */       } else {
/* 220 */         return null;
/*     */       }
/* 222 */       if (localadd2.b == 0) {
/* 223 */         localaay.c(null);
/*     */       } else {
/* 225 */         localaay.f();
/*     */       }
/* 227 */       if (localadd2.b == localadd1.b) {
/* 228 */         return null;
/*     */       }
/* 230 */       localaay.a(paramyz, localadd2);
/*     */     }
/*     */     
/* 233 */     return localadd1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */