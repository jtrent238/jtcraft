/*     */ import com.mojang.authlib.GameProfile;
/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class bop
/*     */   extends boh
/*     */ {
/*  23 */   private static final bqx a = new bqx("textures/entity/steve.png");
/*     */   private bhm f;
/*     */   private bhm g;
/*     */   private bhm h;
/*     */   
/*     */   public bop() {
/*  29 */     super(new bhm(0.0F), 0.5F);
/*     */     
/*  31 */     this.f = ((bhm)this.i);
/*     */     
/*  33 */     this.g = new bhm(1.0F);
/*  34 */     this.h = new bhm(0.5F);
/*     */   }
/*     */   
/*     */   protected int a(blg paramblg, int paramInt, float paramFloat)
/*     */   {
/*  39 */     add localadd = paramblg.bm.d(3 - paramInt);
/*  40 */     if (localadd != null) {
/*  41 */       adb localadb = localadd.b();
/*  42 */       if ((localadb instanceof abb)) {
/*  43 */         abb localabb = (abb)localadb;
/*  44 */         a(bnw.a(localabb, paramInt));
/*     */         
/*  46 */         bhm localbhm = paramInt == 2 ? this.h : this.g;
/*     */         
/*  48 */         localbhm.c.j = (paramInt == 0);
/*  49 */         localbhm.d.j = (paramInt == 0);
/*  50 */         localbhm.e.j = ((paramInt == 1) || (paramInt == 2));
/*  51 */         localbhm.f.j = (paramInt == 1);
/*  52 */         localbhm.g.j = (paramInt == 1);
/*  53 */         localbhm.h.j = ((paramInt == 2) || (paramInt == 3));
/*  54 */         localbhm.i.j = ((paramInt == 2) || (paramInt == 3));
/*     */         
/*  56 */         a(localbhm);
/*  57 */         localbhm.p = this.i.p;
/*  58 */         localbhm.q = this.i.q;
/*  59 */         localbhm.s = this.i.s;
/*     */         
/*  61 */         if (localabb.m_() == abd.a) {
/*  62 */           int i = localabb.b(localadd);
/*  63 */           float f1 = (i >> 16 & 0xFF) / 255.0F;
/*  64 */           float f2 = (i >> 8 & 0xFF) / 255.0F;
/*  65 */           float f3 = (i & 0xFF) / 255.0F;
/*  66 */           GL11.glColor3f(f1, f2, f3);
/*     */           
/*  68 */           if (localadd.y()) return 31;
/*  69 */           return 16;
/*     */         }
/*  71 */         GL11.glColor3f(1.0F, 1.0F, 1.0F);
/*     */         
/*     */ 
/*  74 */         if (localadd.y()) { return 15;
/*     */         }
/*  76 */         return 1;
/*     */       }
/*     */     }
/*  79 */     return -1;
/*     */   }
/*     */   
/*     */   protected void b(blg paramblg, int paramInt, float paramFloat)
/*     */   {
/*  84 */     add localadd = paramblg.bm.d(3 - paramInt);
/*  85 */     if (localadd != null) {
/*  86 */       adb localadb = localadd.b();
/*  87 */       if ((localadb instanceof abb)) {
/*  88 */         a(bnw.a((abb)localadb, paramInt, "overlay"));
/*     */         
/*  90 */         GL11.glColor3f(1.0F, 1.0F, 1.0F);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(blg paramblg, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*     */   {
/*  97 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/*  98 */     add localadd = paramblg.bm.h();
/*  99 */     this.g.m = (this.h.m = this.f.m = localadd != null ? 1 : 0);
/* 100 */     if ((localadd != null) && 
/* 101 */       (paramblg.bx() > 0)) {
/* 102 */       aei localaei = localadd.o();
/* 103 */       if (localaei == aei.d) {
/* 104 */         this.g.m = (this.h.m = this.f.m = 3);
/* 105 */       } else if (localaei == aei.e) {
/* 106 */         this.g.o = (this.h.o = this.f.o = 1);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 111 */     this.g.n = (this.h.n = this.f.n = paramblg.an());
/*     */     
/* 113 */     double d = paramDouble2 - paramblg.L;
/* 114 */     if ((paramblg.an()) && (!(paramblg instanceof blk))) {
/* 115 */       d -= 0.125D;
/*     */     }
/* 117 */     super.a(paramblg, paramDouble1, d, paramDouble3, paramFloat1, paramFloat2);
/* 118 */     this.g.o = (this.h.o = this.f.o = 0);
/* 119 */     this.g.n = (this.h.n = this.f.n = 0);
/* 120 */     this.g.m = (this.h.m = this.f.m = 0);
/*     */   }
/*     */   
/*     */   protected bqx a(blg paramblg)
/*     */   {
/* 125 */     return paramblg.r();
/*     */   }
/*     */   
/*     */   protected void a(blg paramblg, float paramFloat)
/*     */   {
/* 130 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/* 131 */     super.c(paramblg, paramFloat);
/* 132 */     super.e(paramblg, paramFloat);
/* 133 */     add localadd1 = paramblg.bm.d(3);
/*     */     
/* 135 */     if (localadd1 != null) {
/* 136 */       GL11.glPushMatrix();
/* 137 */       this.f.c.c(0.0625F);
/*     */       float f1;
/* 139 */       if ((localadd1.b() instanceof abh)) {
/* 140 */         if (blm.a(aji.a(localadd1.b()).b())) {
/* 141 */           f1 = 0.625F;
/* 142 */           GL11.glTranslatef(0.0F, -0.25F, 0.0F);
/* 143 */           GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 144 */           GL11.glScalef(f1, -f1, -f1);
/*     */         }
/*     */         
/* 147 */         this.b.f.a(paramblg, localadd1, 0);
/* 148 */       } else if (localadd1.b() == ade.bL) {
/* 149 */         f1 = 1.0625F;
/* 150 */         GL11.glScalef(f1, -f1, -f1);
/*     */         
/* 152 */         GameProfile localGameProfile = null;
/* 153 */         if (localadd1.p()) {
/* 154 */           dh localdh = localadd1.q();
/* 155 */           if (localdh.b("SkullOwner", 10)) {
/* 156 */             localGameProfile = dv.a(localdh.m("SkullOwner"));
/* 157 */           } else if ((localdh.b("SkullOwner", 8)) && (!qn.b(localdh.j("SkullOwner")))) {
/* 158 */             localGameProfile = new GameProfile(null, localdh.j("SkullOwner"));
/*     */           }
/*     */         }
/*     */         
/* 162 */         bms.b.a(-0.5F, 0.0F, -0.5F, 1, 180.0F, localadd1.k(), localGameProfile);
/*     */       }
/*     */       
/* 165 */       GL11.glPopMatrix();
/*     */     }
/*     */     
/* 168 */     if ((paramblg.b_().equals("deadmau5")) && (paramblg.o())) {
/* 169 */       a(paramblg.r());
/* 170 */       for (bool = false; bool < true; bool++) {
/* 171 */         float f2 = paramblg.A + (paramblg.y - paramblg.A) * paramFloat - (paramblg.aN + (paramblg.aM - paramblg.aN) * paramFloat);
/* 172 */         float f3 = paramblg.B + (paramblg.z - paramblg.B) * paramFloat;
/* 173 */         GL11.glPushMatrix();
/* 174 */         GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
/* 175 */         GL11.glRotatef(f3, 1.0F, 0.0F, 0.0F);
/* 176 */         GL11.glTranslatef(0.375F * (bool * true - 1), 0.0F, 0.0F);
/* 177 */         GL11.glTranslatef(0.0F, -0.375F, 0.0F);
/* 178 */         GL11.glRotatef(-f3, 1.0F, 0.0F, 0.0F);
/* 179 */         GL11.glRotatef(-f2, 0.0F, 1.0F, 0.0F);
/*     */         
/* 181 */         float f4 = 1.3333334F;
/* 182 */         GL11.glScalef(f4, f4, f4);
/* 183 */         this.f.b(0.0625F);
/* 184 */         GL11.glPopMatrix();
/*     */       }
/*     */     }
/*     */     
/* 188 */     boolean bool = paramblg.n();
/* 189 */     float f9; if ((bool) && (!paramblg.ap()) && (!paramblg.bT())) {
/* 190 */       a(paramblg.s());
/* 191 */       GL11.glPushMatrix();
/* 192 */       GL11.glTranslatef(0.0F, 0.0F, 0.125F);
/*     */       
/* 194 */       double d1 = paramblg.bu + (paramblg.bx - paramblg.bu) * paramFloat - (paramblg.p + (paramblg.s - paramblg.p) * paramFloat);
/* 195 */       double d2 = paramblg.bv + (paramblg.by - paramblg.bv) * paramFloat - (paramblg.q + (paramblg.t - paramblg.q) * paramFloat);
/* 196 */       double d3 = paramblg.bw + (paramblg.bz - paramblg.bw) * paramFloat - (paramblg.r + (paramblg.u - paramblg.r) * paramFloat);
/*     */       
/* 198 */       f9 = paramblg.aN + (paramblg.aM - paramblg.aN) * paramFloat;
/*     */       
/* 200 */       double d4 = qh.a(f9 * 3.1415927F / 180.0F);
/* 201 */       double d5 = -qh.b(f9 * 3.1415927F / 180.0F);
/*     */       
/* 203 */       float f10 = (float)d2 * 10.0F;
/* 204 */       if (f10 < -6.0F) f10 = -6.0F;
/* 205 */       if (f10 > 32.0F) f10 = 32.0F;
/* 206 */       float f11 = (float)(d1 * d4 + d3 * d5) * 100.0F;
/* 207 */       float f12 = (float)(d1 * d5 - d3 * d4) * 100.0F;
/* 208 */       if (f11 < 0.0F) { f11 = 0.0F;
/*     */       }
/* 210 */       float f13 = paramblg.br + (paramblg.bs - paramblg.br) * paramFloat;
/*     */       
/* 212 */       f10 += qh.a((paramblg.O + (paramblg.P - paramblg.O) * paramFloat) * 6.0F) * 32.0F * f13;
/* 213 */       if (paramblg.an()) {
/* 214 */         f10 += 25.0F;
/*     */       }
/*     */       
/* 217 */       GL11.glRotatef(6.0F + f11 / 2.0F + f10, 1.0F, 0.0F, 0.0F);
/* 218 */       GL11.glRotatef(f12 / 2.0F, 0.0F, 0.0F, 1.0F);
/* 219 */       GL11.glRotatef(-f12 / 2.0F, 0.0F, 1.0F, 0.0F);
/* 220 */       GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/* 221 */       this.f.c(0.0625F);
/* 222 */       GL11.glPopMatrix();
/*     */     }
/*     */     
/* 225 */     add localadd2 = paramblg.bm.h();
/*     */     
/* 227 */     if (localadd2 != null) {
/* 228 */       GL11.glPushMatrix();
/* 229 */       this.f.f.c(0.0625F);
/* 230 */       GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
/*     */       
/* 232 */       if (paramblg.bK != null) {
/* 233 */         localadd2 = new add(ade.y);
/*     */       }
/*     */       
/* 236 */       aei localaei = null;
/* 237 */       if (paramblg.bx() > 0) {
/* 238 */         localaei = localadd2.o();
/*     */       }
/*     */       float f5;
/* 241 */       if (((localadd2.b() instanceof abh)) && (blm.a(aji.a(localadd2.b()).b()))) {
/* 242 */         f5 = 0.5F;
/* 243 */         GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
/* 244 */         f5 *= 0.75F;
/* 245 */         GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
/* 246 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 247 */         GL11.glScalef(-f5, -f5, f5);
/* 248 */       } else if (localadd2.b() == ade.f) {
/* 249 */         f5 = 0.625F;
/* 250 */         GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
/* 251 */         GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
/* 252 */         GL11.glScalef(f5, -f5, f5);
/* 253 */         GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/* 254 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 255 */       } else if (localadd2.b().f()) {
/* 256 */         f5 = 0.625F;
/* 257 */         if (localadd2.b().g()) {
/* 258 */           GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/* 259 */           GL11.glTranslatef(0.0F, -0.125F, 0.0F);
/*     */         }
/* 261 */         if ((paramblg.bx() > 0) && 
/* 262 */           (localaei == aei.d)) {
/* 263 */           GL11.glTranslatef(0.05F, 0.0F, -0.1F);
/* 264 */           GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
/* 265 */           GL11.glRotatef(-10.0F, 1.0F, 0.0F, 0.0F);
/* 266 */           GL11.glRotatef(-60.0F, 0.0F, 0.0F, 1.0F);
/*     */         }
/*     */         
/* 269 */         GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
/* 270 */         GL11.glScalef(f5, -f5, f5);
/* 271 */         GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/* 272 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*     */       } else {
/* 274 */         f5 = 0.375F;
/* 275 */         GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
/* 276 */         GL11.glScalef(f5, f5, f5);
/* 277 */         GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
/* 278 */         GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/* 279 */         GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F); }
/*     */       int i;
/*     */       float f7;
/* 282 */       float f8; if (localadd2.b().b()) {
/* 283 */         for (i = 0; i <= 1; i++) {
/* 284 */           int j = localadd2.b().a(localadd2, i);
/* 285 */           f7 = (j >> 16 & 0xFF) / 255.0F;
/* 286 */           f8 = (j >> 8 & 0xFF) / 255.0F;
/* 287 */           f9 = (j & 0xFF) / 255.0F;
/*     */           
/* 289 */           GL11.glColor4f(f7, f8, f9, 1.0F);
/* 290 */           this.b.f.a(paramblg, localadd2, i);
/*     */         }
/*     */       } else {
/* 293 */         i = localadd2.b().a(localadd2, 0);
/* 294 */         float f6 = (i >> 16 & 0xFF) / 255.0F;
/* 295 */         f7 = (i >> 8 & 0xFF) / 255.0F;
/* 296 */         f8 = (i & 0xFF) / 255.0F;
/*     */         
/* 298 */         GL11.glColor4f(f6, f7, f8, 1.0F);
/* 299 */         this.b.f.a(paramblg, localadd2, 0);
/*     */       }
/*     */       
/* 302 */       GL11.glPopMatrix();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(blg paramblg, float paramFloat)
/*     */   {
/* 308 */     float f1 = 0.9375F;
/* 309 */     GL11.glScalef(f1, f1, f1);
/*     */   }
/*     */   
/*     */   protected void a(blg paramblg, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat, double paramDouble4)
/*     */   {
/* 314 */     if (paramDouble4 < 100.0D) {
/* 315 */       bac localbac = paramblg.bU();
/* 316 */       azx localazx = localbac.a(2);
/*     */       
/* 318 */       if (localazx != null) {
/* 319 */         azz localazz = localbac.a(paramblg.b_(), localazx);
/*     */         
/* 321 */         if (paramblg.bm()) {
/* 322 */           a(paramblg, localazz.c() + " " + localazx.d(), paramDouble1, paramDouble2 - 1.5D, paramDouble3, 64);
/*     */         } else {
/* 324 */           a(paramblg, localazz.c() + " " + localazx.d(), paramDouble1, paramDouble2, paramDouble3, 64);
/*     */         }
/*     */         
/* 327 */         paramDouble2 += c().a * 1.15F * paramFloat;
/*     */       }
/*     */     }
/*     */     
/* 331 */     super.a(paramblg, paramDouble1, paramDouble2, paramDouble3, paramString, paramFloat, paramDouble4);
/*     */   }
/*     */   
/*     */   public void a(yz paramyz) {
/* 335 */     float f1 = 1.0F;
/* 336 */     GL11.glColor3f(f1, f1, f1);
/* 337 */     this.f.p = 0.0F;
/* 338 */     this.f.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, paramyz);
/* 339 */     this.f.f.a(0.0625F);
/*     */   }
/*     */   
/*     */   protected void a(blg paramblg, double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 344 */     if ((paramblg.Z()) && (paramblg.bm())) {
/* 345 */       super.a(paramblg, paramDouble1 + paramblg.bC, paramDouble2 + paramblg.cc, paramDouble3 + paramblg.bD);
/*     */     }
/*     */     else {
/* 348 */       super.a(paramblg, paramDouble1, paramDouble2, paramDouble3);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a(blg paramblg, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 355 */     if ((paramblg.Z()) && (paramblg.bm())) {
/* 356 */       GL11.glRotatef(paramblg.bK(), 0.0F, 1.0F, 0.0F);
/* 357 */       GL11.glRotatef(a(paramblg), 0.0F, 0.0F, 1.0F);
/* 358 */       GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
/*     */     } else {
/* 360 */       super.a(paramblg, paramFloat1, paramFloat2, paramFloat3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */