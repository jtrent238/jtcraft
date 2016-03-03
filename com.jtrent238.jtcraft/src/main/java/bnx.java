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
/*     */ public class bnx
/*     */   extends bno
/*     */ {
/*  22 */   private static final bqx a = new bqx("textures/map/map_background.png");
/*  23 */   private final blm f = new blm();
/*  24 */   private final bao g = bao.B();
/*     */   private rf h;
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/*  29 */     this.h = paramrg.a("itemframe_background");
/*     */   }
/*     */   
/*     */   public void a(st paramst, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*     */   {
/*  34 */     GL11.glPushMatrix();
/*  35 */     double d1 = paramst.s - paramDouble1 - 0.5D;
/*  36 */     double d2 = paramst.t - paramDouble2 - 0.5D;
/*  37 */     double d3 = paramst.u - paramDouble3 - 0.5D;
/*     */     
/*  39 */     int i = paramst.b + p.a[paramst.a];
/*  40 */     int j = paramst.c;
/*  41 */     int k = paramst.d + p.b[paramst.a];
/*     */     
/*  43 */     GL11.glTranslated(i - d1, j - d2, k - d3);
/*     */     
/*  45 */     if ((paramst.j() != null) && (paramst.j().b() == ade.aY)) {
/*  46 */       b(paramst);
/*     */     } else {
/*  48 */       c(paramst);
/*     */     }
/*     */     
/*  51 */     d(paramst);
/*     */     
/*  53 */     GL11.glPopMatrix();
/*  54 */     a(paramst, paramDouble1 + p.a[paramst.a] * 0.3F, paramDouble2 - 0.25D, paramDouble3 + p.b[paramst.a] * 0.3F);
/*     */   }
/*     */   
/*     */ 
/*     */   protected bqx a(st paramst)
/*     */   {
/*  60 */     return null;
/*     */   }
/*     */   
/*     */   private void b(st paramst) {
/*  64 */     GL11.glPushMatrix();
/*  65 */     GL11.glRotatef(paramst.y, 0.0F, 1.0F, 0.0F);
/*     */     
/*  67 */     this.b.e.a(bpz.b);
/*  68 */     aji localaji = ajn.f;
/*  69 */     float f1 = 0.0625F;
/*  70 */     float f2 = 1.0F;
/*  71 */     float f3 = f2 / 2.0F;
/*     */     
/*     */ 
/*  74 */     GL11.glPushMatrix();
/*  75 */     this.f.b(0.0D, 0.5F - f3 + 0.0625F, 0.5F - f3 + 0.0625F, f1, 0.5F + f3 - 0.0625F, 0.5F + f3 - 0.0625F);
/*  76 */     this.f.a(this.h);
/*  77 */     this.f.a(localaji, 0, 1.0F);
/*  78 */     this.f.a();
/*  79 */     this.f.c();
/*  80 */     GL11.glPopMatrix();
/*     */     
/*  82 */     this.f.a(ajn.f.a(1, 2));
/*     */     
/*  84 */     GL11.glPushMatrix();
/*  85 */     this.f.b(0.0D, 0.5F - f3, 0.5F - f3, f1 + 1.0E-4F, f1 + 0.5F - f3, 0.5F + f3);
/*  86 */     this.f.a(localaji, 0, 1.0F);
/*  87 */     GL11.glPopMatrix();
/*     */     
/*     */ 
/*  90 */     GL11.glPushMatrix();
/*  91 */     this.f.b(0.0D, 0.5F + f3 - f1, 0.5F - f3, f1 + 1.0E-4F, 0.5F + f3, 0.5F + f3);
/*  92 */     this.f.a(localaji, 0, 1.0F);
/*  93 */     GL11.glPopMatrix();
/*     */     
/*     */ 
/*  96 */     GL11.glPushMatrix();
/*  97 */     this.f.b(0.0D, 0.5F - f3, 0.5F - f3, f1, 0.5F + f3, f1 + 0.5F - f3);
/*  98 */     this.f.a(localaji, 0, 1.0F);
/*  99 */     GL11.glPopMatrix();
/*     */     
/*     */ 
/* 102 */     GL11.glPushMatrix();
/* 103 */     this.f.b(0.0D, 0.5F - f3, 0.5F + f3 - f1, f1, 0.5F + f3, 0.5F + f3);
/* 104 */     this.f.a(localaji, 0, 1.0F);
/* 105 */     GL11.glPopMatrix();
/*     */     
/* 107 */     this.f.c();
/* 108 */     this.f.a();
/*     */     
/* 110 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   private void c(st paramst)
/*     */   {
/* 115 */     GL11.glPushMatrix();
/* 116 */     GL11.glRotatef(paramst.y, 0.0F, 1.0F, 0.0F);
/*     */     
/* 118 */     this.b.e.a(bpz.b);
/* 119 */     aji localaji = ajn.f;
/* 120 */     float f1 = 0.0625F;
/* 121 */     float f2 = 0.75F;
/* 122 */     float f3 = f2 / 2.0F;
/*     */     
/*     */ 
/* 125 */     GL11.glPushMatrix();
/* 126 */     this.f.b(0.0D, 0.5F - f3 + 0.0625F, 0.5F - f3 + 0.0625F, f1 * 0.5F, 0.5F + f3 - 0.0625F, 0.5F + f3 - 0.0625F);
/* 127 */     this.f.a(this.h);
/* 128 */     this.f.a(localaji, 0, 1.0F);
/* 129 */     this.f.a();
/* 130 */     this.f.c();
/* 131 */     GL11.glPopMatrix();
/*     */     
/* 133 */     this.f.a(ajn.f.a(1, 2));
/*     */     
/* 135 */     GL11.glPushMatrix();
/* 136 */     this.f.b(0.0D, 0.5F - f3, 0.5F - f3, f1 + 1.0E-4F, f1 + 0.5F - f3, 0.5F + f3);
/* 137 */     this.f.a(localaji, 0, 1.0F);
/* 138 */     GL11.glPopMatrix();
/*     */     
/*     */ 
/* 141 */     GL11.glPushMatrix();
/* 142 */     this.f.b(0.0D, 0.5F + f3 - f1, 0.5F - f3, f1 + 1.0E-4F, 0.5F + f3, 0.5F + f3);
/* 143 */     this.f.a(localaji, 0, 1.0F);
/* 144 */     GL11.glPopMatrix();
/*     */     
/*     */ 
/* 147 */     GL11.glPushMatrix();
/* 148 */     this.f.b(0.0D, 0.5F - f3, 0.5F - f3, f1, 0.5F + f3, f1 + 0.5F - f3);
/* 149 */     this.f.a(localaji, 0, 1.0F);
/* 150 */     GL11.glPopMatrix();
/*     */     
/*     */ 
/* 153 */     GL11.glPushMatrix();
/* 154 */     this.f.b(0.0D, 0.5F - f3, 0.5F + f3 - f1, f1, 0.5F + f3, 0.5F + f3);
/* 155 */     this.f.a(localaji, 0, 1.0F);
/* 156 */     GL11.glPopMatrix();
/*     */     
/* 158 */     this.f.c();
/* 159 */     this.f.a();
/*     */     
/* 161 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   private void d(st paramst) {
/* 165 */     add localadd = paramst.j();
/* 166 */     if (localadd == null) { return;
/*     */     }
/* 168 */     xk localxk = new xk(paramst.o, 0.0D, 0.0D, 0.0D, localadd);
/* 169 */     adb localadb = localxk.f().b();
/* 170 */     localxk.f().b = 1;
/* 171 */     localxk.c = 0.0F;
/*     */     
/* 173 */     GL11.glPushMatrix();
/*     */     
/* 175 */     GL11.glTranslatef(-0.453125F * p.a[paramst.a], -0.18F, -0.453125F * p.b[paramst.a]);
/* 176 */     GL11.glRotatef(180.0F + paramst.y, 0.0F, 1.0F, 0.0F);
/* 177 */     GL11.glRotatef(-90 * paramst.k(), 0.0F, 0.0F, 1.0F);
/*     */     
/* 179 */     switch (paramst.k()) {
/*     */     case 1: 
/* 181 */       GL11.glTranslatef(-0.16F, -0.16F, 0.0F);
/* 182 */       break;
/*     */     case 2: 
/* 184 */       GL11.glTranslatef(0.0F, -0.32F, 0.0F);
/* 185 */       break;
/*     */     case 3: 
/* 187 */       GL11.glTranslatef(0.16F, -0.16F, 0.0F);
/*     */     }
/*     */     Object localObject1;
/*     */     Object localObject2;
/* 191 */     if (localadb == ade.aY) {
/* 192 */       this.b.e.a(a);
/* 193 */       localObject1 = bmh.a;
/*     */       
/* 195 */       GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/* 196 */       GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/* 197 */       float f1 = 0.0078125F;
/* 198 */       GL11.glScalef(f1, f1, f1);
/*     */       
/*     */ 
/* 201 */       switch (paramst.k()) {
/*     */       case 0: 
/* 203 */         GL11.glTranslatef(-64.0F, -87.0F, -1.5F);
/* 204 */         break;
/*     */       case 1: 
/* 206 */         GL11.glTranslatef(-66.5F, -84.5F, -1.5F);
/* 207 */         break;
/*     */       case 2: 
/* 209 */         GL11.glTranslatef(-64.0F, -82.0F, -1.5F);
/* 210 */         break;
/*     */       case 3: 
/* 212 */         GL11.glTranslatef(-61.5F, -84.5F, -1.5F);
/*     */       }
/*     */       
/* 215 */       GL11.glNormal3f(0.0F, 0.0F, -1.0F);
/*     */       
/* 217 */       localObject2 = ade.aY.a(localxk.f(), paramst.o);
/* 218 */       GL11.glTranslatef(0.0F, 0.0F, -1.0F);
/* 219 */       if (localObject2 != null) this.g.p.i().a((ayi)localObject2, true);
/*     */     }
/*     */     else {
/* 222 */       if (localadb == ade.aL) {
/* 223 */         localObject1 = bao.B().P();
/* 224 */         ((bqf)localObject1).a(bpz.c);
/*     */         
/* 226 */         bqd localbqd = ((bpz)((bqf)localObject1).b(bpz.c)).b(ade.aL.j(localxk.f()).g());
/*     */         
/* 228 */         if ((localbqd instanceof bqm)) {
/* 229 */           localObject2 = (bqm)localbqd;
/*     */           
/* 231 */           double d1 = ((bqm)localObject2).i;
/* 232 */           double d2 = ((bqm)localObject2).j;
/* 233 */           ((bqm)localObject2).i = 0.0D;
/* 234 */           ((bqm)localObject2).j = 0.0D;
/* 235 */           ((bqm)localObject2).a(paramst.o, paramst.s, paramst.u, qh.g(180 + paramst.a * 90), false, true);
/* 236 */           ((bqm)localObject2).i = d1;
/* 237 */           ((bqm)localObject2).j = d2;
/*     */         }
/*     */       }
/*     */       
/* 241 */       bny.g = true;
/* 242 */       bnn.a.a(localxk, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
/* 243 */       bny.g = false;
/*     */       
/*     */ 
/* 246 */       if (localadb == ade.aL) {
/* 247 */         localObject1 = ((bpz)bao.B().P().b(bpz.c)).b(ade.aL.j(localxk.f()).g());
/* 248 */         if (((bqd)localObject1).k() > 0) {
/* 249 */           ((bqd)localObject1).j();
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 254 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   protected void a(st paramst, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 258 */     if ((bao.w()) && (paramst.j() != null) && (paramst.j().u()) && (this.b.i == paramst)) {
/* 259 */       float f1 = 1.6F;
/* 260 */       float f2 = 0.016666668F * f1;
/* 261 */       double d = paramst.f(this.b.h);
/*     */       
/* 263 */       float f3 = paramst.an() ? 32.0F : 64.0F;
/*     */       
/* 265 */       if (d < f3 * f3) {
/* 266 */         String str = paramst.j().s();
/*     */         
/* 268 */         if (paramst.an()) {
/* 269 */           bbu localbbu = c();
/* 270 */           GL11.glPushMatrix();
/* 271 */           GL11.glTranslatef((float)paramDouble1 + 0.0F, (float)paramDouble2 + paramst.N + 0.5F, (float)paramDouble3);
/* 272 */           GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/*     */           
/* 274 */           GL11.glRotatef(-this.b.j, 0.0F, 1.0F, 0.0F);
/* 275 */           GL11.glRotatef(this.b.k, 1.0F, 0.0F, 0.0F);
/*     */           
/* 277 */           GL11.glScalef(-f2, -f2, f2);
/* 278 */           GL11.glDisable(2896);
/*     */           
/* 280 */           GL11.glTranslatef(0.0F, 0.25F / f2, 0.0F);
/* 281 */           GL11.glDepthMask(false);
/* 282 */           GL11.glEnable(3042);
/* 283 */           GL11.glBlendFunc(770, 771);
/* 284 */           bmh localbmh = bmh.a;
/*     */           
/* 286 */           GL11.glDisable(3553);
/* 287 */           localbmh.b();
/* 288 */           int i = localbbu.a(str) / 2;
/* 289 */           localbmh.a(0.0F, 0.0F, 0.0F, 0.25F);
/* 290 */           localbmh.a(-i - 1, -1.0D, 0.0D);
/* 291 */           localbmh.a(-i - 1, 8.0D, 0.0D);
/* 292 */           localbmh.a(i + 1, 8.0D, 0.0D);
/* 293 */           localbmh.a(i + 1, -1.0D, 0.0D);
/* 294 */           localbmh.a();
/* 295 */           GL11.glEnable(3553);
/* 296 */           GL11.glDepthMask(true);
/* 297 */           localbbu.b(str, -localbbu.a(str) / 2, 0, 553648127);
/* 298 */           GL11.glEnable(2896);
/* 299 */           GL11.glDisable(3042);
/* 300 */           GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 301 */           GL11.glPopMatrix();
/*     */         } else {
/* 303 */           a(paramst, str, paramDouble1, paramDouble2, paramDouble3, 64);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */