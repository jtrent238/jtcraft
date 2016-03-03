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
/*     */ public class ajx
/*     */   extends ajc
/*     */ {
/*  27 */   private final Random b = new Random();
/*     */   public final int a;
/*     */   
/*     */   protected ajx(int paramInt) {
/*  31 */     super(awt.d);
/*  32 */     this.a = paramInt;
/*  33 */     a(abt.c);
/*     */     
/*  35 */     a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  40 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  45 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  50 */     return 22;
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  55 */     if (paramahl.a(paramInt1, paramInt2, paramInt3 - 1) == this) {
/*  56 */       a(0.0625F, 0.0F, 0.0F, 0.9375F, 0.875F, 0.9375F);
/*  57 */     } else if (paramahl.a(paramInt1, paramInt2, paramInt3 + 1) == this) {
/*  58 */       a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 1.0F);
/*  59 */     } else if (paramahl.a(paramInt1 - 1, paramInt2, paramInt3) == this) {
/*  60 */       a(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
/*  61 */     } else if (paramahl.a(paramInt1 + 1, paramInt2, paramInt3) == this) {
/*  62 */       a(0.0625F, 0.0F, 0.0625F, 1.0F, 0.875F, 0.9375F);
/*     */     } else {
/*  64 */       a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  70 */     super.b(paramahb, paramInt1, paramInt2, paramInt3);
/*  71 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     
/*  73 */     aji localaji1 = paramahb.a(paramInt1, paramInt2, paramInt3 - 1);
/*  74 */     aji localaji2 = paramahb.a(paramInt1, paramInt2, paramInt3 + 1);
/*  75 */     aji localaji3 = paramahb.a(paramInt1 - 1, paramInt2, paramInt3);
/*  76 */     aji localaji4 = paramahb.a(paramInt1 + 1, paramInt2, paramInt3);
/*  77 */     if (localaji1 == this) e(paramahb, paramInt1, paramInt2, paramInt3 - 1);
/*  78 */     if (localaji2 == this) e(paramahb, paramInt1, paramInt2, paramInt3 + 1);
/*  79 */     if (localaji3 == this) e(paramahb, paramInt1 - 1, paramInt2, paramInt3);
/*  80 */     if (localaji4 == this) e(paramahb, paramInt1 + 1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/*  85 */     aji localaji1 = paramahb.a(paramInt1, paramInt2, paramInt3 - 1);
/*  86 */     aji localaji2 = paramahb.a(paramInt1, paramInt2, paramInt3 + 1);
/*  87 */     aji localaji3 = paramahb.a(paramInt1 - 1, paramInt2, paramInt3);
/*  88 */     aji localaji4 = paramahb.a(paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  90 */     int i = 0;
/*  91 */     int j = qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x3;
/*     */     
/*  93 */     if (j == 0) i = 2;
/*  94 */     if (j == 1) i = 5;
/*  95 */     if (j == 2) i = 3;
/*  96 */     if (j == 3) { i = 4;
/*     */     }
/*  98 */     if ((localaji1 != this) && (localaji2 != this) && (localaji3 != this) && (localaji4 != this)) {
/*  99 */       paramahb.a(paramInt1, paramInt2, paramInt3, i, 3);
/*     */     } else {
/* 101 */       if (((localaji1 == this) || (localaji2 == this)) && ((i == 4) || (i == 5))) {
/* 102 */         if (localaji1 == this) paramahb.a(paramInt1, paramInt2, paramInt3 - 1, i, 3); else
/* 103 */           paramahb.a(paramInt1, paramInt2, paramInt3 + 1, i, 3);
/* 104 */         paramahb.a(paramInt1, paramInt2, paramInt3, i, 3);
/*     */       }
/* 106 */       if (((localaji3 == this) || (localaji4 == this)) && ((i == 2) || (i == 3))) {
/* 107 */         if (localaji3 == this) paramahb.a(paramInt1 - 1, paramInt2, paramInt3, i, 3); else
/* 108 */           paramahb.a(paramInt1 + 1, paramInt2, paramInt3, i, 3);
/* 109 */         paramahb.a(paramInt1, paramInt2, paramInt3, i, 3);
/*     */       }
/*     */     }
/*     */     
/* 113 */     if (paramadd.u()) {
/* 114 */       ((aow)paramahb.o(paramInt1, paramInt2, paramInt3)).a(paramadd.s());
/*     */     }
/*     */   }
/*     */   
/*     */   public void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 119 */     if (paramahb.E) {
/* 120 */       return;
/*     */     }
/*     */     
/* 123 */     aji localaji1 = paramahb.a(paramInt1, paramInt2, paramInt3 - 1);
/* 124 */     aji localaji2 = paramahb.a(paramInt1, paramInt2, paramInt3 + 1);
/* 125 */     aji localaji3 = paramahb.a(paramInt1 - 1, paramInt2, paramInt3);
/* 126 */     aji localaji4 = paramahb.a(paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*     */ 
/* 129 */     int i = 4;
/* 130 */     int j; aji localaji5; int k; aji localaji6; int m; if ((localaji1 == this) || (localaji2 == this)) {
/* 131 */       j = localaji1 == this ? paramInt3 - 1 : paramInt3 + 1;
/* 132 */       localaji5 = paramahb.a(paramInt1 - 1, paramInt2, j);
/* 133 */       k = localaji1 == this ? paramInt3 - 1 : paramInt3 + 1;
/* 134 */       localaji6 = paramahb.a(paramInt1 + 1, paramInt2, k);
/*     */       
/* 136 */       i = 5;
/*     */       
/* 138 */       m = -1;
/* 139 */       if (localaji1 == this) m = paramahb.e(paramInt1, paramInt2, paramInt3 - 1); else
/* 140 */         m = paramahb.e(paramInt1, paramInt2, paramInt3 + 1);
/* 141 */       if (m == 4) { i = 4;
/*     */       }
/* 143 */       if (((localaji3.j()) || (localaji5.j())) && (!localaji4.j()) && (!localaji6.j())) i = 5;
/* 144 */       if (((localaji4.j()) || (localaji6.j())) && (!localaji3.j()) && (!localaji5.j())) i = 4;
/* 145 */     } else if ((localaji3 == this) || (localaji4 == this)) {
/* 146 */       j = localaji3 == this ? paramInt1 - 1 : paramInt1 + 1;
/* 147 */       localaji5 = paramahb.a(j, paramInt2, paramInt3 - 1);
/* 148 */       k = localaji3 == this ? paramInt1 - 1 : paramInt1 + 1;
/* 149 */       localaji6 = paramahb.a(k, paramInt2, paramInt3 + 1);
/*     */       
/* 151 */       i = 3;
/* 152 */       m = -1;
/* 153 */       if (localaji3 == this) m = paramahb.e(paramInt1 - 1, paramInt2, paramInt3); else
/* 154 */         m = paramahb.e(paramInt1 + 1, paramInt2, paramInt3);
/* 155 */       if (m == 2) { i = 2;
/*     */       }
/* 157 */       if (((localaji1.j()) || (localaji5.j())) && (!localaji2.j()) && (!localaji6.j())) i = 3;
/* 158 */       if (((localaji2.j()) || (localaji6.j())) && (!localaji1.j()) && (!localaji5.j())) i = 2;
/*     */     } else {
/* 160 */       i = 3;
/* 161 */       if ((localaji1.j()) && (!localaji2.j())) i = 3;
/* 162 */       if ((localaji2.j()) && (!localaji1.j())) i = 2;
/* 163 */       if ((localaji3.j()) && (!localaji4.j())) i = 5;
/* 164 */       if ((localaji4.j()) && (!localaji3.j())) { i = 4;
/*     */       }
/*     */     }
/* 167 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 3);
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 172 */     int i = 0;
/*     */     
/* 174 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3) == this) i++;
/* 175 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3) == this) i++;
/* 176 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1) == this) i++;
/* 177 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1) == this) { i++;
/*     */     }
/* 179 */     if (i > 1) { return false;
/*     */     }
/* 181 */     if (n(paramahb, paramInt1 - 1, paramInt2, paramInt3)) return false;
/* 182 */     if (n(paramahb, paramInt1 + 1, paramInt2, paramInt3)) return false;
/* 183 */     if (n(paramahb, paramInt1, paramInt2, paramInt3 - 1)) return false;
/* 184 */     if (n(paramahb, paramInt1, paramInt2, paramInt3 + 1)) return false;
/* 185 */     return true;
/*     */   }
/*     */   
/*     */   private boolean n(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 189 */     if (paramahb.a(paramInt1, paramInt2, paramInt3) != this) return false;
/* 190 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3) == this) return true;
/* 191 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3) == this) return true;
/* 192 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1) == this) return true;
/* 193 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1) == this) return true;
/* 194 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 199 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji);
/* 200 */     aow localaow = (aow)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 201 */     if (localaow != null) localaow.u();
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 206 */     aow localaow = (aow)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 207 */     if (localaow != null) {
/* 208 */       for (int i = 0; i < localaow.a(); i++) {
/* 209 */         add localadd = localaow.a(i);
/* 210 */         if (localadd != null) {
/* 211 */           float f1 = this.b.nextFloat() * 0.8F + 0.1F;
/* 212 */           float f2 = this.b.nextFloat() * 0.8F + 0.1F;
/* 213 */           float f3 = this.b.nextFloat() * 0.8F + 0.1F;
/*     */           
/* 215 */           while (localadd.b > 0) {
/* 216 */             int j = this.b.nextInt(21) + 10;
/* 217 */             if (j > localadd.b) j = localadd.b;
/* 218 */             localadd.b -= j;
/*     */             
/* 220 */             xk localxk = new xk(paramahb, paramInt1 + f1, paramInt2 + f2, paramInt3 + f3, new add(localadd.b(), j, localadd.k()));
/* 221 */             float f4 = 0.05F;
/* 222 */             localxk.v = ((float)this.b.nextGaussian() * f4);
/* 223 */             localxk.w = ((float)this.b.nextGaussian() * f4 + 0.2F);
/* 224 */             localxk.x = ((float)this.b.nextGaussian() * f4);
/* 225 */             if (localadd.p()) {
/* 226 */               localxk.f().d((dh)localadd.q().b());
/*     */             }
/* 228 */             paramahb.d(localxk);
/*     */           }
/*     */         }
/*     */       }
/* 232 */       paramahb.f(paramInt1, paramInt2, paramInt3, paramaji);
/*     */     }
/* 234 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 239 */     if (paramahb.E) return true;
/* 240 */     rb localrb = m(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     
/* 242 */     if (localrb != null) {
/* 243 */       paramyz.a(localrb);
/*     */     }
/*     */     
/* 246 */     return true;
/*     */   }
/*     */   
/*     */   public rb m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 250 */     Object localObject = (aow)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 251 */     if (localObject == null) { return null;
/*     */     }
/* 253 */     if (paramahb.a(paramInt1, paramInt2 + 1, paramInt3).r()) return null;
/* 254 */     if (o(paramahb, paramInt1, paramInt2, paramInt3)) { return null;
/*     */     }
/* 256 */     if ((paramahb.a(paramInt1 - 1, paramInt2, paramInt3) == this) && ((paramahb.a(paramInt1 - 1, paramInt2 + 1, paramInt3).r()) || (o(paramahb, paramInt1 - 1, paramInt2, paramInt3)))) return null;
/* 257 */     if ((paramahb.a(paramInt1 + 1, paramInt2, paramInt3) == this) && ((paramahb.a(paramInt1 + 1, paramInt2 + 1, paramInt3).r()) || (o(paramahb, paramInt1 + 1, paramInt2, paramInt3)))) return null;
/* 258 */     if ((paramahb.a(paramInt1, paramInt2, paramInt3 - 1) == this) && ((paramahb.a(paramInt1, paramInt2 + 1, paramInt3 - 1).r()) || (o(paramahb, paramInt1, paramInt2, paramInt3 - 1)))) return null;
/* 259 */     if ((paramahb.a(paramInt1, paramInt2, paramInt3 + 1) == this) && ((paramahb.a(paramInt1, paramInt2 + 1, paramInt3 + 1).r()) || (o(paramahb, paramInt1, paramInt2, paramInt3 + 1)))) { return null;
/*     */     }
/* 261 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3) == this) localObject = new ra("container.chestDouble", (aow)paramahb.o(paramInt1 - 1, paramInt2, paramInt3), (rb)localObject);
/* 262 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3) == this) localObject = new ra("container.chestDouble", (rb)localObject, (aow)paramahb.o(paramInt1 + 1, paramInt2, paramInt3));
/* 263 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1) == this) localObject = new ra("container.chestDouble", (aow)paramahb.o(paramInt1, paramInt2, paramInt3 - 1), (rb)localObject);
/* 264 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1) == this) { localObject = new ra("container.chestDouble", (rb)localObject, (aow)paramahb.o(paramInt1, paramInt2, paramInt3 + 1));
/*     */     }
/* 266 */     return (rb)localObject;
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/* 271 */     aow localaow = new aow();
/* 272 */     return localaow;
/*     */   }
/*     */   
/*     */   public boolean f()
/*     */   {
/* 277 */     return this.a == 1;
/*     */   }
/*     */   
/*     */   public int b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 282 */     if (!f()) { return 0;
/*     */     }
/* 284 */     int i = ((aow)paramahl.o(paramInt1, paramInt2, paramInt3)).o;
/* 285 */     return qh.a(i, 0, 15);
/*     */   }
/*     */   
/*     */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 290 */     if (paramInt4 == 1) {
/* 291 */       return b(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/* 293 */     return 0;
/*     */   }
/*     */   
/*     */   private static boolean o(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 298 */     for (sa localsa : paramahb.a(wn.class, azt.a(paramInt1, paramInt2 + 1, paramInt3, paramInt1 + 1, paramInt2 + 2, paramInt3 + 1))) {
/* 299 */       wn localwn = (wn)localsa;
/* 300 */       if (localwn.ca()) return true;
/*     */     }
/* 302 */     return false;
/*     */   }
/*     */   
/*     */   public boolean M()
/*     */   {
/* 307 */     return true;
/*     */   }
/*     */   
/*     */   public int g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 312 */     return zs.b(m(paramahb, paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(rg paramrg)
/*     */   {
/* 319 */     this.L = paramrg.a("planks_oak");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */