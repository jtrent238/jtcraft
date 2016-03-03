/*     */ import com.google.common.collect.Sets;
/*     */ import java.awt.Color;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public abstract class ahu
/*     */ {
/*  24 */   private static final Logger aC = ;
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
/*  46 */   protected static final ahv a = new ahv(0.1F, 0.2F);
/*  47 */   protected static final ahv b = new ahv(-0.5F, 0.0F);
/*  48 */   protected static final ahv c = new ahv(-1.0F, 0.1F);
/*  49 */   protected static final ahv d = new ahv(-1.8F, 0.1F);
/*  50 */   protected static final ahv e = new ahv(0.125F, 0.05F);
/*  51 */   protected static final ahv f = new ahv(0.2F, 0.2F);
/*  52 */   protected static final ahv g = new ahv(0.45F, 0.3F);
/*  53 */   protected static final ahv h = new ahv(1.5F, 0.025F);
/*  54 */   protected static final ahv i = new ahv(1.0F, 0.5F);
/*  55 */   protected static final ahv j = new ahv(0.0F, 0.025F);
/*  56 */   protected static final ahv k = new ahv(0.1F, 0.8F);
/*  57 */   protected static final ahv l = new ahv(0.2F, 0.3F);
/*  58 */   protected static final ahv m = new ahv(-0.2F, 0.1F);
/*     */   
/*  60 */   private static final ahu[] aD = new ahu['Ā'];
/*  61 */   public static final Set n = Sets.newHashSet();
/*     */   
/*  63 */   public static final ahu o = new aio(0).b(112).a("Ocean").a(c);
/*  64 */   public static final ahu p = new aip(1).b(9286496).a("Plains");
/*  65 */   public static final ahu q = new aic(2).b(16421912).a("Desert").b().a(2.0F, 0.0F).a(e);
/*     */   
/*  67 */   public static final ahu r = new aid(3, false).b(6316128).a("Extreme Hills").a(i).a(0.2F, 0.3F);
/*  68 */   public static final ahu s = new aif(4, 0).b(353825).a("Forest");
/*  69 */   public static final ahu t = new aiw(5, 0).b(747097).a("Taiga").a(5159473).a(0.25F, 0.8F).a(f);
/*     */   
/*     */ 
/*  72 */   public static final ahu u = new aiv(6).b(522674).a("Swampland").a(9154376).a(m).a(0.8F, 0.9F);
/*  73 */   public static final ahu v = new air(7).b(255).a("River").a(b);
/*     */   
/*  75 */   public static final ahu w = new aii(8).b(16711680).a("Hell").b().a(2.0F, 0.0F);
/*  76 */   public static final ahu x = new aix(9).b(8421631).a("Sky").b();
/*     */   
/*  78 */   public static final ahu y = new aio(10).b(9474208).a("FrozenOcean").c().a(c).a(0.0F, 0.5F);
/*  79 */   public static final ahu z = new air(11).b(10526975).a("FrozenRiver").c().a(b).a(0.0F, 0.5F);
/*  80 */   public static final ahu A = new aij(12, false).b(16777215).a("Ice Plains").c().a(0.0F, 0.5F).a(e);
/*  81 */   public static final ahu B = new aij(13, false).b(10526880).a("Ice Mountains").c().a(g).a(0.0F, 0.5F);
/*     */   
/*     */ 
/*  84 */   public static final ahu C = new aim(14).b(16711935).a("MushroomIsland").a(0.9F, 1.0F).a(l);
/*  85 */   public static final ahu D = new aim(15).b(10486015).a("MushroomIslandShore").a(0.9F, 1.0F).a(j);
/*     */   
/*  87 */   public static final ahu E = new aht(16).b(16440917).a("Beach").a(0.8F, 0.4F).a(j);
/*  88 */   public static final ahu F = new aic(17).b(13786898).a("DesertHills").b().a(2.0F, 0.0F).a(g);
/*  89 */   public static final ahu G = new aif(18, 0).b(2250012).a("ForestHills").a(g);
/*  90 */   public static final ahu H = new aiw(19, 0).b(1456435).a("TaigaHills").a(5159473).a(0.25F, 0.8F).a(g);
/*     */   
/*  92 */   public static final ahu I = new aid(20, true).b(7501978).a("Extreme Hills Edge").a(i.a()).a(0.2F, 0.3F);
/*     */   
/*     */ 
/*  95 */   public static final ahu J = new aik(21, false).b(5470985).a("Jungle").a(5470985).a(0.95F, 0.9F);
/*  96 */   public static final ahu K = new aik(22, false).b(2900485).a("JungleHills").a(5470985).a(0.95F, 0.9F).a(g);
/*     */   
/*  98 */   public static final ahu L = new aik(23, true).b(6458135).a("JungleEdge").a(5470985).a(0.95F, 0.8F);
/*     */   
/* 100 */   public static final ahu M = new aio(24).b(48).a("Deep Ocean").a(d);
/* 101 */   public static final ahu N = new aiu(25).b(10658436).a("Stone Beach").a(0.2F, 0.3F).a(k);
/* 102 */   public static final ahu O = new aht(26).b(16445632).a("Cold Beach").a(0.05F, 0.3F).a(j).c();
/*     */   
/* 104 */   public static final ahu P = new aif(27, 2).a("Birch Forest").b(3175492);
/* 105 */   public static final ahu Q = new aif(28, 2).a("Birch Forest Hills").b(2055986).a(g);
/* 106 */   public static final ahu R = new aif(29, 3).b(4215066).a("Roofed Forest");
/*     */   
/* 108 */   public static final ahu S = new aiw(30, 0).b(3233098).a("Cold Taiga").a(5159473).c().a(-0.5F, 0.4F).a(f).c(16777215);
/*     */   
/* 110 */   public static final ahu T = new aiw(31, 0).b(2375478).a("Cold Taiga Hills").a(5159473).c().a(-0.5F, 0.4F).a(g).c(16777215);
/*     */   
/* 112 */   public static final ahu U = new aiw(32, 1).b(5858897).a("Mega Taiga").a(5159473).a(0.3F, 0.8F).a(f);
/*     */   
/* 114 */   public static final ahu V = new aiw(33, 1).b(4542270).a("Mega Taiga Hills").a(5159473).a(0.3F, 0.8F).a(g);
/*     */   
/*     */ 
/* 117 */   public static final ahu W = new aid(34, true).b(5271632).a("Extreme Hills+").a(i).a(0.2F, 0.3F);
/*     */   
/*     */ 
/* 120 */   public static final ahu X = new ais(35).b(12431967).a("Savanna").a(1.2F, 0.0F).b().a(e);
/* 121 */   public static final ahu Y = new ais(36).b(10984804).a("Savanna Plateau").a(1.0F, 0.0F).b().a(h);
/*     */   
/* 123 */   public static final ahu Z = new ail(37, false, false).b(14238997).a("Mesa");
/* 124 */   public static final ahu aa = new ail(38, false, true).b(11573093).a("Mesa Plateau F").a(h);
/* 125 */   public static final ahu ab = new ail(39, false, false).b(13274213).a("Mesa Plateau").a(h);
/*     */   
/*     */   static
/*     */   {
/* 129 */     p.k();
/* 130 */     q.k();
/* 131 */     s.k();
/* 132 */     t.k();
/* 133 */     u.k();
/* 134 */     A.k();
/* 135 */     J.k();
/* 136 */     L.k();
/* 137 */     S.k();
/* 138 */     X.k();
/* 139 */     Y.k();
/* 140 */     Z.k();
/* 141 */     aa.k();
/* 142 */     ab.k();
/* 143 */     P.k();
/* 144 */     Q.k();
/* 145 */     R.k();
/* 146 */     U.k();
/* 147 */     r.k();
/* 148 */     W.k();
/*     */     
/*     */ 
/* 151 */     aD[(V.ay + 128)] = aD[(U.ay + 128)];
/*     */     
/* 153 */     for (ahu localahu : aD) {
/* 154 */       if ((localahu != null) && (localahu.ay < 128)) {
/* 155 */         n.add(localahu);
/*     */       }
/*     */     }
/*     */     
/* 159 */     n.remove(w);
/* 160 */     n.remove(x);
/* 161 */     n.remove(y);
/* 162 */     n.remove(I);
/*     */   }
/*     */   
/* 165 */   protected static final awl ac = new awl(new Random(1234L), 1);
/* 166 */   protected static final awl ad = new awl(new Random(2345L), 1);
/* 167 */   protected static final arm ae = new arm();
/*     */   public String af;
/*     */   public int ag;
/*     */   public int ah;
/* 171 */   public aji ai = ajn.c;
/* 172 */   public int aj = 0;
/* 173 */   public aji ak = ajn.d;
/* 174 */   public int al = 5169201;
/* 175 */   public float am = a.a;
/* 176 */   public float an = a.b;
/* 177 */   public float ao = 0.5F;
/* 178 */   public float ap = 0.5F;
/* 179 */   public int aq = 16777215;
/*     */   
/*     */   public aia ar;
/*     */   
/* 183 */   protected List as = new ArrayList();
/* 184 */   protected List at = new ArrayList();
/* 185 */   protected List au = new ArrayList();
/* 186 */   protected List av = new ArrayList();
/*     */   protected boolean aw;
/* 188 */   protected boolean ax = true;
/*     */   public final int ay;
/*     */   
/*     */   protected ahu(int paramInt)
/*     */   {
/* 193 */     this.ay = paramInt;
/* 194 */     aD[paramInt] = this;
/* 195 */     this.ar = a();
/*     */     
/* 197 */     this.at.add(new ahx(wp.class, 12, 4, 4));
/* 198 */     this.at.add(new ahx(wo.class, 10, 4, 4));
/* 199 */     this.at.add(new ahx(wg.class, 10, 4, 4));
/* 200 */     this.at.add(new ahx(wh.class, 8, 4, 4));
/*     */     
/* 202 */     this.as.add(new ahx(yn.class, 100, 4, 4));
/* 203 */     this.as.add(new ahx(yq.class, 100, 4, 4));
/* 204 */     this.as.add(new ahx(yl.class, 100, 4, 4));
/* 205 */     this.as.add(new ahx(xz.class, 100, 4, 4));
/* 206 */     this.as.add(new ahx(ym.class, 100, 4, 4));
/* 207 */     this.as.add(new ahx(ya.class, 10, 1, 4));
/* 208 */     this.as.add(new ahx(yp.class, 5, 1, 1));
/*     */     
/*     */ 
/*     */ 
/* 212 */     this.au.add(new ahx(ws.class, 10, 4, 4));
/*     */     
/* 214 */     this.av.add(new ahx(we.class, 10, 8, 8));
/*     */   }
/*     */   
/*     */   protected aia a() {
/* 218 */     return new aia();
/*     */   }
/*     */   
/*     */   protected ahu a(float paramFloat1, float paramFloat2) {
/* 222 */     if ((paramFloat1 > 0.1F) && (paramFloat1 < 0.2F)) { throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
/*     */     }
/* 224 */     this.ao = paramFloat1;
/* 225 */     this.ap = paramFloat2;
/* 226 */     return this;
/*     */   }
/*     */   
/*     */   protected final ahu a(ahv paramahv) {
/* 230 */     this.am = paramahv.a;
/* 231 */     this.an = paramahv.b;
/* 232 */     return this;
/*     */   }
/*     */   
/*     */   protected ahu b() {
/* 236 */     this.ax = false;
/* 237 */     return this;
/*     */   }
/*     */   
/* 240 */   protected asq az = new asq(false);
/* 241 */   protected ard aA = new ard(false);
/* 242 */   protected aso aB = new aso();
/*     */   
/*     */   public arc a(Random paramRandom) {
/* 245 */     if (paramRandom.nextInt(10) == 0) {
/* 246 */       return this.aA;
/*     */     }
/* 248 */     return this.az;
/*     */   }
/*     */   
/*     */   public arn b(Random paramRandom) {
/* 252 */     return new asp(ajn.H, 1);
/*     */   }
/*     */   
/*     */   public String a(Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/* 256 */     if (paramRandom.nextInt(3) > 0) {
/* 257 */       return alc.b[0];
/*     */     }
/* 259 */     return alc.a[0];
/*     */   }
/*     */   
/*     */   protected ahu c() {
/* 263 */     this.aw = true;
/* 264 */     return this;
/*     */   }
/*     */   
/*     */   protected ahu a(String paramString) {
/* 268 */     this.af = paramString;
/* 269 */     return this;
/*     */   }
/*     */   
/*     */   protected ahu a(int paramInt) {
/* 273 */     this.al = paramInt;
/* 274 */     return this;
/*     */   }
/*     */   
/*     */   protected ahu b(int paramInt) {
/* 278 */     a(paramInt, false);
/* 279 */     return this;
/*     */   }
/*     */   
/*     */   protected ahu c(int paramInt) {
/* 283 */     this.ah = paramInt;
/* 284 */     return this;
/*     */   }
/*     */   
/*     */   protected ahu a(int paramInt, boolean paramBoolean) {
/* 288 */     this.ag = paramInt;
/* 289 */     if (paramBoolean) {
/* 290 */       this.ah = ((paramInt & 0xFEFEFE) >> 1);
/*     */     } else {
/* 292 */       this.ah = paramInt;
/*     */     }
/* 294 */     return this;
/*     */   }
/*     */   
/*     */   public int a(float paramFloat) {
/* 298 */     paramFloat /= 3.0F;
/* 299 */     if (paramFloat < -1.0F) paramFloat = -1.0F;
/* 300 */     if (paramFloat > 1.0F) paramFloat = 1.0F;
/* 301 */     return Color.getHSBColor(0.62222224F - paramFloat * 0.05F, 0.5F + paramFloat * 0.1F, 1.0F).getRGB();
/*     */   }
/*     */   
/*     */   public List a(sx paramsx) {
/* 305 */     if (paramsx == sx.a) return this.as;
/* 306 */     if (paramsx == sx.b) return this.at;
/* 307 */     if (paramsx == sx.d) return this.au;
/* 308 */     if (paramsx == sx.c) return this.av;
/* 309 */     return null;
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
/*     */   public boolean d()
/*     */   {
/* 331 */     return j();
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 335 */     if (j()) return false;
/* 336 */     return this.ax;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 340 */     return this.ap > 0.85F;
/*     */   }
/*     */   
/*     */   public float g() {
/* 344 */     return 0.1F;
/*     */   }
/*     */   
/*     */   public final int h() {
/* 348 */     return (int)(this.ap * 65536.0F);
/*     */   }
/*     */   
/*     */   public final float i() {
/* 352 */     return this.ap;
/*     */   }
/*     */   
/*     */   public final float a(int paramInt1, int paramInt2, int paramInt3) {
/* 356 */     if (paramInt2 > 64) {
/* 357 */       float f1 = (float)ac.a(paramInt1 * 1.0D / 8.0D, paramInt3 * 1.0D / 8.0D) * 4.0F;
/* 358 */       return this.ao - (f1 + paramInt2 - 64.0F) * 0.05F / 30.0F;
/*     */     }
/* 360 */     return this.ao;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2) {
/* 364 */     this.ar.a(paramahb, paramRandom, this, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public int b(int paramInt1, int paramInt2, int paramInt3) {
/* 368 */     double d1 = qh.a(a(paramInt1, paramInt2, paramInt3), 0.0F, 1.0F);
/* 369 */     double d2 = qh.a(i(), 0.0F, 1.0F);
/*     */     
/* 371 */     return aha.a(d1, d2);
/*     */   }
/*     */   
/*     */   public int c(int paramInt1, int paramInt2, int paramInt3) {
/* 375 */     double d1 = qh.a(a(paramInt1, paramInt2, paramInt3), 0.0F, 1.0F);
/* 376 */     double d2 = qh.a(i(), 0.0F, 1.0F);
/*     */     
/* 378 */     return agx.a(d1, d2);
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 382 */     return this.aw;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, Random paramRandom, aji[] paramArrayOfaji, byte[] paramArrayOfByte, int paramInt1, int paramInt2, double paramDouble)
/*     */   {
/* 387 */     b(paramahb, paramRandom, paramArrayOfaji, paramArrayOfByte, paramInt1, paramInt2, paramDouble);
/*     */   }
/*     */   
/*     */   public final void b(ahb paramahb, Random paramRandom, aji[] paramArrayOfaji, byte[] paramArrayOfByte, int paramInt1, int paramInt2, double paramDouble) {
/* 391 */     int i1 = 63;
/* 392 */     aji localaji1 = this.ai;
/* 393 */     int i2 = (byte)(this.aj & 0xFF);
/* 394 */     aji localaji2 = this.ak;
/* 395 */     int i3 = -1;
/* 396 */     int i4 = (int)(paramDouble / 3.0D + 3.0D + paramRandom.nextDouble() * 0.25D);
/*     */     
/* 398 */     int i5 = paramInt1 & 0xF;
/* 399 */     int i6 = paramInt2 & 0xF;
/* 400 */     int i7 = paramArrayOfaji.length / 256;
/* 401 */     for (int i8 = 255; i8 >= 0; i8--) {
/* 402 */       int i9 = (i6 * 16 + i5) * i7 + i8;
/*     */       
/* 404 */       if (i8 <= 0 + paramRandom.nextInt(5)) {
/* 405 */         paramArrayOfaji[i9] = ajn.h;
/*     */       } else {
/* 407 */         aji localaji3 = paramArrayOfaji[i9];
/*     */         
/* 409 */         if ((localaji3 == null) || (localaji3.o() == awt.a)) {
/* 410 */           i3 = -1;
/* 411 */         } else if (localaji3 == ajn.b) {
/* 412 */           if (i3 == -1) {
/* 413 */             if (i4 <= 0) {
/* 414 */               localaji1 = null;
/* 415 */               i2 = 0;
/* 416 */               localaji2 = ajn.b;
/* 417 */             } else if ((i8 >= 59) && (i8 <= 64)) {
/* 418 */               localaji1 = this.ai;
/* 419 */               i2 = (byte)(this.aj & 0xFF);
/* 420 */               localaji2 = this.ak;
/*     */             }
/*     */             
/* 423 */             if ((i8 < 63) && ((localaji1 == null) || (localaji1.o() == awt.a))) {
/* 424 */               if (a(paramInt1, i8, paramInt2) < 0.15F) {
/* 425 */                 localaji1 = ajn.aD;
/* 426 */                 i2 = 0;
/*     */               } else {
/* 428 */                 localaji1 = ajn.j;
/* 429 */                 i2 = 0;
/*     */               }
/*     */             }
/*     */             
/* 433 */             i3 = i4;
/* 434 */             if (i8 >= 62) {
/* 435 */               paramArrayOfaji[i9] = localaji1;
/* 436 */               paramArrayOfByte[i9] = i2;
/* 437 */             } else if (i8 < 56 - i4) {
/* 438 */               localaji1 = null;
/* 439 */               localaji2 = ajn.b;
/* 440 */               paramArrayOfaji[i9] = ajn.n;
/* 441 */             } else { paramArrayOfaji[i9] = localaji2;
/* 442 */             } } else if (i3 > 0) {
/* 443 */             i3--;
/* 444 */             paramArrayOfaji[i9] = localaji2;
/*     */             
/*     */ 
/* 447 */             if ((i3 == 0) && (localaji2 == ajn.m)) {
/* 448 */               i3 = paramRandom.nextInt(4) + Math.max(0, i8 - 63);
/* 449 */               localaji2 = ajn.A;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected ahu k() {
/* 458 */     return new ain(this.ay + 128, this);
/*     */   }
/*     */   
/*     */   public Class l() {
/* 462 */     return getClass();
/*     */   }
/*     */   
/*     */   public boolean a(ahu paramahu) {
/* 466 */     if (paramahu == this) {
/* 467 */       return true;
/*     */     }
/* 469 */     if (paramahu == null) {
/* 470 */       return false;
/*     */     }
/* 472 */     return l() == paramahu.l();
/*     */   }
/*     */   
/*     */   public ahw m() {
/* 476 */     if (this.ao < 0.2D) {
/* 477 */       return ahw.b;
/*     */     }
/* 479 */     if (this.ao < 1.0D) {
/* 480 */       return ahw.c;
/*     */     }
/* 482 */     return ahw.d;
/*     */   }
/*     */   
/*     */   public static ahu[] n() {
/* 486 */     return aD;
/*     */   }
/*     */   
/*     */   public static ahu d(int paramInt) {
/* 490 */     if ((paramInt < 0) || (paramInt > aD.length)) {
/* 491 */       aC.warn("Biome ID is out of bounds: " + paramInt + ", defaulting to 0 (Ocean)");
/* 492 */       return o;
/*     */     }
/* 494 */     return aD[paramInt];
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ahu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */