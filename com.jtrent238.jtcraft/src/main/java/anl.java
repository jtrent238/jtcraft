/*     */ import java.util.Iterator;
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
/*     */ public class anl
/*     */   extends ajc
/*     */ {
/*     */   protected anl()
/*     */   {
/*  32 */     super(awt.q);
/*  33 */     a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  38 */     return -1;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  43 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  48 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  53 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3) & 0x7;
/*     */     
/*  55 */     switch (i) {
/*     */     case 1: 
/*     */     default: 
/*  58 */       a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
/*  59 */       break;
/*     */     case 2: 
/*  61 */       a(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
/*  62 */       break;
/*     */     case 3: 
/*  64 */       a(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
/*  65 */       break;
/*     */     case 4: 
/*  67 */       a(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
/*  68 */       break;
/*     */     case 5: 
/*  70 */       a(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  77 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/*  78 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/*  83 */     int i = qh.c(paramsv.y * 4.0F / 360.0F + 2.5D) & 0x3;
/*  84 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/*  89 */     return new apn();
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  94 */     return ade.bL;
/*     */   }
/*     */   
/*     */   public int k(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  99 */     aor localaor = paramahb.o(paramInt1, paramInt2, paramInt3);
/* 100 */     if ((localaor != null) && ((localaor instanceof apn))) {
/* 101 */       return ((apn)localaor).b();
/*     */     }
/* 103 */     return super.k(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/* 108 */     return paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, yz paramyz)
/*     */   {
/* 119 */     if (paramyz.bE.d)
/*     */     {
/* 121 */       paramInt4 |= 0x8;
/* 122 */       paramahb.a(paramInt1, paramInt2, paramInt3, paramInt4, 4);
/*     */     }
/* 124 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramyz);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 129 */     if (paramahb.E) return;
/* 130 */     if ((paramInt4 & 0x8) == 0) {
/* 131 */       add localadd = new add(ade.bL, 1, k(paramahb, paramInt1, paramInt2, paramInt3));
/* 132 */       apn localapn = (apn)paramahb.o(paramInt1, paramInt2, paramInt3);
/*     */       
/* 134 */       if ((localapn.b() == 3) && (localapn.a() != null)) {
/* 135 */         localadd.d(new dh());
/* 136 */         dh localdh = new dh();
/* 137 */         dv.a(localdh, localapn.a());
/* 138 */         localadd.q().a("SkullOwner", localdh);
/*     */       }
/*     */       
/* 141 */       a(paramahb, paramInt1, paramInt2, paramInt3, localadd);
/*     */     }
/* 143 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 148 */     return ade.bL;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, apn paramapn) {
/* 152 */     if ((paramapn.b() == 1) && (paramInt2 >= 2) && (paramahb.r != rd.a) && (!paramahb.E))
/*     */     {
/*     */       Iterator localIterator;
/*     */       
/*     */       yz localyz;
/* 157 */       for (int i = -2; i <= 0; i++) {
/* 158 */         if ((paramahb.a(paramInt1, paramInt2 - 1, paramInt3 + i) == ajn.aM) && (paramahb.a(paramInt1, paramInt2 - 1, paramInt3 + i + 1) == ajn.aM) && (paramahb.a(paramInt1, paramInt2 - 2, paramInt3 + i + 1) == ajn.aM) && (paramahb.a(paramInt1, paramInt2 - 1, paramInt3 + i + 2) == ajn.aM) && (a(paramahb, paramInt1, paramInt2, paramInt3 + i, 1)) && (a(paramahb, paramInt1, paramInt2, paramInt3 + i + 1, 1)) && (a(paramahb, paramInt1, paramInt2, paramInt3 + i + 2, 1)))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */           paramahb.a(paramInt1, paramInt2, paramInt3 + i, 8, 2);
/* 168 */           paramahb.a(paramInt1, paramInt2, paramInt3 + i + 1, 8, 2);
/* 169 */           paramahb.a(paramInt1, paramInt2, paramInt3 + i + 2, 8, 2);
/* 170 */           paramahb.d(paramInt1, paramInt2, paramInt3 + i, e(0), 0, 2);
/* 171 */           paramahb.d(paramInt1, paramInt2, paramInt3 + i + 1, e(0), 0, 2);
/* 172 */           paramahb.d(paramInt1, paramInt2, paramInt3 + i + 2, e(0), 0, 2);
/* 173 */           paramahb.d(paramInt1, paramInt2 - 1, paramInt3 + i, e(0), 0, 2);
/* 174 */           paramahb.d(paramInt1, paramInt2 - 1, paramInt3 + i + 1, e(0), 0, 2);
/* 175 */           paramahb.d(paramInt1, paramInt2 - 1, paramInt3 + i + 2, e(0), 0, 2);
/* 176 */           paramahb.d(paramInt1, paramInt2 - 2, paramInt3 + i + 1, e(0), 0, 2);
/*     */           
/* 178 */           if (!paramahb.E) {
/* 179 */             xc localxc1 = new xc(paramahb);
/* 180 */             localxc1.b(paramInt1 + 0.5D, paramInt2 - 1.45D, paramInt3 + i + 1.5D, 90.0F, 0.0F);
/* 181 */             localxc1.aM = 90.0F;
/* 182 */             localxc1.bZ();
/*     */             
/* 184 */             if (!paramahb.E) {
/* 185 */               for (localIterator = paramahb.a(yz.class, localxc1.C.b(50.0D, 50.0D, 50.0D)).iterator(); localIterator.hasNext();) { localyz = (yz)localIterator.next();
/* 186 */                 localyz.a(pc.I);
/*     */               }
/*     */             }
/*     */             
/* 190 */             paramahb.d(localxc1);
/*     */           }
/*     */           
/* 193 */           for (int j = 0; j < 120; j++) {
/* 194 */             paramahb.a("snowballpoof", paramInt1 + paramahb.s.nextDouble(), paramInt2 - 2 + paramahb.s.nextDouble() * 3.9D, paramInt3 + i + 1 + paramahb.s.nextDouble(), 0.0D, 0.0D, 0.0D);
/*     */           }
/*     */           
/* 197 */           paramahb.c(paramInt1, paramInt2, paramInt3 + i, e(0));
/* 198 */           paramahb.c(paramInt1, paramInt2, paramInt3 + i + 1, e(0));
/* 199 */           paramahb.c(paramInt1, paramInt2, paramInt3 + i + 2, e(0));
/* 200 */           paramahb.c(paramInt1, paramInt2 - 1, paramInt3 + i, e(0));
/* 201 */           paramahb.c(paramInt1, paramInt2 - 1, paramInt3 + i + 1, e(0));
/* 202 */           paramahb.c(paramInt1, paramInt2 - 1, paramInt3 + i + 2, e(0));
/* 203 */           paramahb.c(paramInt1, paramInt2 - 2, paramInt3 + i + 1, e(0));
/*     */           
/* 205 */           return;
/*     */         }
/*     */       }
/*     */       
/* 209 */       for (i = -2; i <= 0; i++) {
/* 210 */         if ((paramahb.a(paramInt1 + i, paramInt2 - 1, paramInt3) == ajn.aM) && (paramahb.a(paramInt1 + i + 1, paramInt2 - 1, paramInt3) == ajn.aM) && (paramahb.a(paramInt1 + i + 1, paramInt2 - 2, paramInt3) == ajn.aM) && (paramahb.a(paramInt1 + i + 2, paramInt2 - 1, paramInt3) == ajn.aM) && (a(paramahb, paramInt1 + i, paramInt2, paramInt3, 1)) && (a(paramahb, paramInt1 + i + 1, paramInt2, paramInt3, 1)) && (a(paramahb, paramInt1 + i + 2, paramInt2, paramInt3, 1)))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 219 */           paramahb.a(paramInt1 + i, paramInt2, paramInt3, 8, 2);
/* 220 */           paramahb.a(paramInt1 + i + 1, paramInt2, paramInt3, 8, 2);
/* 221 */           paramahb.a(paramInt1 + i + 2, paramInt2, paramInt3, 8, 2);
/* 222 */           paramahb.d(paramInt1 + i, paramInt2, paramInt3, e(0), 0, 2);
/* 223 */           paramahb.d(paramInt1 + i + 1, paramInt2, paramInt3, e(0), 0, 2);
/* 224 */           paramahb.d(paramInt1 + i + 2, paramInt2, paramInt3, e(0), 0, 2);
/* 225 */           paramahb.d(paramInt1 + i, paramInt2 - 1, paramInt3, e(0), 0, 2);
/* 226 */           paramahb.d(paramInt1 + i + 1, paramInt2 - 1, paramInt3, e(0), 0, 2);
/* 227 */           paramahb.d(paramInt1 + i + 2, paramInt2 - 1, paramInt3, e(0), 0, 2);
/* 228 */           paramahb.d(paramInt1 + i + 1, paramInt2 - 2, paramInt3, e(0), 0, 2);
/*     */           
/* 230 */           if (!paramahb.E) {
/* 231 */             xc localxc2 = new xc(paramahb);
/* 232 */             localxc2.b(paramInt1 + i + 1.5D, paramInt2 - 1.45D, paramInt3 + 0.5D, 0.0F, 0.0F);
/* 233 */             localxc2.bZ();
/*     */             
/* 235 */             if (!paramahb.E) {
/* 236 */               for (localIterator = paramahb.a(yz.class, localxc2.C.b(50.0D, 50.0D, 50.0D)).iterator(); localIterator.hasNext();) { localyz = (yz)localIterator.next();
/* 237 */                 localyz.a(pc.I);
/*     */               }
/*     */             }
/*     */             
/* 241 */             paramahb.d(localxc2);
/*     */           }
/*     */           
/* 244 */           for (int k = 0; k < 120; k++) {
/* 245 */             paramahb.a("snowballpoof", paramInt1 + i + 1 + paramahb.s.nextDouble(), paramInt2 - 2 + paramahb.s.nextDouble() * 3.9D, paramInt3 + paramahb.s.nextDouble(), 0.0D, 0.0D, 0.0D);
/*     */           }
/*     */           
/* 248 */           paramahb.c(paramInt1 + i, paramInt2, paramInt3, e(0));
/* 249 */           paramahb.c(paramInt1 + i + 1, paramInt2, paramInt3, e(0));
/* 250 */           paramahb.c(paramInt1 + i + 2, paramInt2, paramInt3, e(0));
/* 251 */           paramahb.c(paramInt1 + i, paramInt2 - 1, paramInt3, e(0));
/* 252 */           paramahb.c(paramInt1 + i + 1, paramInt2 - 1, paramInt3, e(0));
/* 253 */           paramahb.c(paramInt1 + i + 2, paramInt2 - 1, paramInt3, e(0));
/* 254 */           paramahb.c(paramInt1 + i + 1, paramInt2 - 2, paramInt3, e(0));
/*     */           
/* 256 */           return;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 263 */     if (paramahb.a(paramInt1, paramInt2, paramInt3) != this) {
/* 264 */       return false;
/*     */     }
/* 266 */     aor localaor = paramahb.o(paramInt1, paramInt2, paramInt3);
/* 267 */     if ((localaor == null) || (!(localaor instanceof apn))) {
/* 268 */       return false;
/*     */     }
/* 270 */     return ((apn)localaor).b() == paramInt4;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(rg paramrg) {}
/*     */   
/*     */ 
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/* 280 */     return ajn.aM.h(paramInt1);
/*     */   }
/*     */   
/*     */   public String O()
/*     */   {
/* 285 */     return N() + "_" + aeb.a[0];
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\anl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */