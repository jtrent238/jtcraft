/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.lang.reflect.Method;
/*     */ import java.net.URI;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.realms.RealmsBridge;
/*     */ import org.apache.commons.io.Charsets;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.opengl.ContextCapabilities;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.opengl.GLContext;
/*     */ import org.lwjgl.util.glu.Project;
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
/*     */ public class bee
/*     */   extends bdw
/*     */   implements bcv
/*     */ {
/*  35 */   private static final Logger f = ;
/*  36 */   private static final Random g = new Random();
/*     */   
/*     */ 
/*     */   private float h;
/*     */   
/*     */ 
/*     */   private String i;
/*     */   
/*     */ 
/*     */   private bcb r;
/*     */   
/*     */ 
/*     */   private int s;
/*     */   
/*     */ 
/*     */   private bpq t;
/*     */   
/*     */ 
/*  54 */   private final Object u = new Object();
/*     */   private String v;
/*  56 */   private String w = a;
/*     */   
/*     */   private String x;
/*  59 */   private static final bqx y = new bqx("texts/splashes.txt");
/*  60 */   private static final bqx z = new bqx("textures/gui/title/minecraft.png");
/*  61 */   private static final bqx[] A = { new bqx("textures/gui/title/background/panorama_0.png"), new bqx("textures/gui/title/background/panorama_1.png"), new bqx("textures/gui/title/background/panorama_2.png"), new bqx("textures/gui/title/background/panorama_3.png"), new bqx("textures/gui/title/background/panorama_4.png"), new bqx("textures/gui/title/background/panorama_5.png") };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  69 */   public static final String a = "Please click " + a.t + "here" + a.v + " for more information.";
/*     */   private int B;
/*     */   private int C;
/*     */   private int D;
/*     */   private int E;
/*     */   private int F;
/*     */   private int G;
/*     */   private bqx H;
/*     */   
/*     */   public bee() {
/*  79 */     this.i = "missingno";
/*     */     
/*  81 */     BufferedReader localBufferedReader = null;
/*     */     try {
/*  83 */       ArrayList localArrayList = new ArrayList();
/*  84 */       localBufferedReader = new BufferedReader(new InputStreamReader(bao.B().Q().a(y).b(), Charsets.UTF_8));
/*     */       String str;
/*  86 */       while ((str = localBufferedReader.readLine()) != null) {
/*  87 */         str = str.trim();
/*  88 */         if (!str.isEmpty()) {
/*  89 */           localArrayList.add(str);
/*     */         }
/*     */       }
/*     */       
/*  93 */       if (!localArrayList.isEmpty())
/*     */       {
/*     */         do
/*     */         {
/*  97 */           this.i = ((String)localArrayList.get(g.nextInt(localArrayList.size())));
/*  98 */         } while (this.i.hashCode() == 125780783);
/*     */       }
/*     */       
/*     */ 
/* 102 */       if (localBufferedReader != null) {
/*     */         try {
/* 104 */           localBufferedReader.close();
/*     */         }
/*     */         catch (IOException localIOException1) {}
/*     */       }
/*     */       
/*     */ 
/* 110 */       this.h = g.nextFloat();
/*     */     }
/*     */     catch (IOException localIOException2) {}finally
/*     */     {
/* 102 */       if (localBufferedReader != null) {
/*     */         try {
/* 104 */           localBufferedReader.close();
/*     */         }
/*     */         catch (IOException localIOException4) {}
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 112 */     this.v = "";
/* 113 */     if ((!GLContext.getCapabilities().OpenGL20) && (!buu.b())) {
/* 114 */       this.v = brp.a("title.oldgl1", new Object[0]);
/* 115 */       this.w = brp.a("title.oldgl2", new Object[0]);
/* 116 */       this.x = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
/*     */     }
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 122 */     this.s += 1;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 127 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a(char paramChar, int paramInt) {}
/*     */   
/*     */ 
/*     */   public void b()
/*     */   {
/* 136 */     this.t = new bpq(256, 256);
/* 137 */     this.H = this.k.P().a("background", this.t);
/*     */     
/* 139 */     Calendar localCalendar = Calendar.getInstance();
/* 140 */     localCalendar.setTime(new Date());
/*     */     
/* 142 */     if ((localCalendar.get(2) + 1 == 11) && (localCalendar.get(5) == 9)) {
/* 143 */       this.i = "Happy birthday, ez!";
/* 144 */     } else if ((localCalendar.get(2) + 1 == 6) && (localCalendar.get(5) == 1)) {
/* 145 */       this.i = "Happy birthday, Notch!";
/* 146 */     } else if ((localCalendar.get(2) + 1 == 12) && (localCalendar.get(5) == 24)) {
/* 147 */       this.i = "Merry X-mas!";
/* 148 */     } else if ((localCalendar.get(2) + 1 == 1) && (localCalendar.get(5) == 1)) {
/* 149 */       this.i = "Happy new year!";
/* 150 */     } else if ((localCalendar.get(2) + 1 == 10) && (localCalendar.get(5) == 31)) {
/* 151 */       this.i = "OOoooOOOoooo! Spooky!";
/*     */     }
/*     */     
/* 154 */     int j = 24;
/* 155 */     int k = this.m / 4 + 48;
/*     */     
/* 157 */     if (this.k.u()) {
/* 158 */       c(k, 24);
/*     */     } else {
/* 160 */       b(k, 24);
/*     */     }
/*     */     
/* 163 */     this.n.add(new bcb(0, this.l / 2 - 100, k + 72 + 12, 98, 20, brp.a("menu.options", new Object[0])));
/* 164 */     this.n.add(new bcb(4, this.l / 2 + 2, k + 72 + 12, 98, 20, brp.a("menu.quit", new Object[0])));
/* 165 */     this.n.add(new bcf(5, this.l / 2 - 124, k + 72 + 12));
/*     */     
/* 167 */     synchronized (this.u) {
/* 168 */       this.C = this.q.a(this.v);
/* 169 */       this.B = this.q.a(this.w);
/*     */       
/* 171 */       int m = Math.max(this.C, this.B);
/* 172 */       this.D = ((this.l - m) / 2);
/* 173 */       this.E = (((bcb)this.n.get(0)).i - 24);
/* 174 */       this.F = (this.D + m);
/* 175 */       this.G = (this.E + 24);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(int paramInt1, int paramInt2) {
/* 180 */     this.n.add(new bcb(1, this.l / 2 - 100, paramInt1, brp.a("menu.singleplayer", new Object[0])));
/* 181 */     this.n.add(new bcb(2, this.l / 2 - 100, paramInt1 + paramInt2 * 1, brp.a("menu.multiplayer", new Object[0])));
/* 182 */     this.n.add(new bcb(14, this.l / 2 - 100, paramInt1 + paramInt2 * 2, brp.a("menu.online", new Object[0])));
/*     */   }
/*     */   
/*     */   private void c(int paramInt1, int paramInt2) {
/* 186 */     this.n.add(new bcb(11, this.l / 2 - 100, paramInt1, brp.a("menu.playdemo", new Object[0])));
/* 187 */     this.n.add(this.r = new bcb(12, this.l / 2 - 100, paramInt1 + paramInt2 * 1, brp.a("menu.resetdemo", new Object[0])));
/*     */     
/* 189 */     aze localaze = this.k.d();
/* 190 */     ays localays = localaze.c("Demo_World");
/* 191 */     if (localays == null) {
/* 192 */       this.r.l = false;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/* 198 */     if (parambcb.k == 0) {
/* 199 */       this.k.a(new bdm(this, this.k.u));
/*     */     }
/* 201 */     if (parambcb.k == 5) {
/* 202 */       this.k.a(new bdj(this, this.k.u, this.k.S()));
/*     */     }
/* 204 */     if (parambcb.k == 1) {
/* 205 */       this.k.a(new bdx(this));
/*     */     }
/* 207 */     if (parambcb.k == 2) {
/* 208 */       this.k.a(new bfz(this));
/*     */     }
/* 210 */     if (parambcb.k == 14) {
/* 211 */       a();
/*     */     }
/* 213 */     if (parambcb.k == 4) {
/* 214 */       this.k.k();
/*     */     }
/* 216 */     if (parambcb.k == 11) {
/* 217 */       this.k.a("Demo_World", "Demo_World", mk.a);
/*     */     }
/* 219 */     if (parambcb.k == 12) {
/* 220 */       aze localaze = this.k.d();
/* 221 */       ays localays = localaze.c("Demo_World");
/* 222 */       if (localays != null) {
/* 223 */         bcw localbcw = bdx.a(this, localays.k(), 12);
/* 224 */         this.k.a(localbcw);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void a() {
/* 230 */     RealmsBridge localRealmsBridge = new RealmsBridge();
/* 231 */     localRealmsBridge.switchToRealms(this);
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean, int paramInt) {
/*     */     Object localObject1;
/* 236 */     if ((paramBoolean) && (paramInt == 12)) {
/* 237 */       localObject1 = this.k.d();
/* 238 */       ((aze)localObject1).d();
/* 239 */       ((aze)localObject1).e("Demo_World");
/*     */       
/* 241 */       this.k.a(this);
/* 242 */     } else if (paramInt == 13) {
/* 243 */       if (paramBoolean) {
/*     */         try {
/* 245 */           localObject1 = Class.forName("java.awt.Desktop");
/* 246 */           Object localObject2 = ((Class)localObject1).getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/* 247 */           ((Class)localObject1).getMethod("browse", new Class[] { URI.class }).invoke(localObject2, new Object[] { new URI(this.x) });
/*     */         } catch (Throwable localThrowable) {
/* 249 */           f.error("Couldn't open link", localThrowable);
/*     */         }
/*     */       }
/*     */       
/* 253 */       this.k.a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(int paramInt1, int paramInt2, float paramFloat) {
/* 258 */     bmh localbmh = bmh.a;
/*     */     
/* 260 */     GL11.glMatrixMode(5889);
/* 261 */     GL11.glPushMatrix();
/* 262 */     GL11.glLoadIdentity();
/*     */     
/* 264 */     Project.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
/*     */     
/* 266 */     GL11.glMatrixMode(5888);
/* 267 */     GL11.glPushMatrix();
/* 268 */     GL11.glLoadIdentity();
/* 269 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 271 */     GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
/* 272 */     GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
/* 273 */     GL11.glEnable(3042);
/* 274 */     GL11.glDisable(3008);
/* 275 */     GL11.glDisable(2884);
/* 276 */     GL11.glDepthMask(false);
/* 277 */     buu.c(770, 771, 1, 0);
/* 278 */     int j = 8;
/*     */     
/* 280 */     for (int k = 0; k < j * j; k++) {
/* 281 */       GL11.glPushMatrix();
/* 282 */       float f1 = (k % j / j - 0.5F) / 64.0F;
/* 283 */       float f2 = (k / j / j - 0.5F) / 64.0F;
/* 284 */       float f3 = 0.0F;
/* 285 */       GL11.glTranslatef(f1, f2, f3);
/*     */       
/* 287 */       GL11.glRotatef(qh.a((this.s + paramFloat) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
/* 288 */       GL11.glRotatef(-(this.s + paramFloat) * 0.1F, 0.0F, 1.0F, 0.0F);
/*     */       
/* 290 */       for (int m = 0; m < 6; m++) {
/* 291 */         GL11.glPushMatrix();
/* 292 */         if (m == 1) GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 293 */         if (m == 2) GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/* 294 */         if (m == 3) GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
/* 295 */         if (m == 4) GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/* 296 */         if (m == 5) GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/* 297 */         this.k.P().a(A[m]);
/* 298 */         localbmh.b();
/* 299 */         localbmh.a(16777215, 255 / (k + 1));
/* 300 */         float f4 = 0.0F;
/* 301 */         localbmh.a(-1.0D, -1.0D, 1.0D, 0.0F + f4, 0.0F + f4);
/* 302 */         localbmh.a(1.0D, -1.0D, 1.0D, 1.0F - f4, 0.0F + f4);
/* 303 */         localbmh.a(1.0D, 1.0D, 1.0D, 1.0F - f4, 1.0F - f4);
/* 304 */         localbmh.a(-1.0D, 1.0D, 1.0D, 0.0F + f4, 1.0F - f4);
/* 305 */         localbmh.a();
/* 306 */         GL11.glPopMatrix();
/*     */       }
/* 308 */       GL11.glPopMatrix();
/* 309 */       GL11.glColorMask(true, true, true, false);
/*     */     }
/* 311 */     localbmh.b(0.0D, 0.0D, 0.0D);
/* 312 */     GL11.glColorMask(true, true, true, true);
/*     */     
/* 314 */     GL11.glMatrixMode(5889);
/* 315 */     GL11.glPopMatrix();
/* 316 */     GL11.glMatrixMode(5888);
/* 317 */     GL11.glPopMatrix();
/* 318 */     GL11.glDepthMask(true);
/* 319 */     GL11.glEnable(2884);
/*     */     
/* 321 */     GL11.glEnable(2929);
/*     */   }
/*     */   
/*     */   private void a(float paramFloat) {
/* 325 */     this.k.P().a(this.H);
/* 326 */     GL11.glTexParameteri(3553, 10241, 9729);
/* 327 */     GL11.glTexParameteri(3553, 10240, 9729);
/* 328 */     GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
/*     */     
/* 330 */     GL11.glEnable(3042);
/* 331 */     buu.c(770, 771, 1, 0);
/* 332 */     GL11.glColorMask(true, true, true, false);
/* 333 */     bmh localbmh = bmh.a;
/* 334 */     localbmh.b();
/*     */     
/* 336 */     GL11.glDisable(3008);
/* 337 */     int j = 3;
/* 338 */     for (int k = 0; k < j; k++) {
/* 339 */       localbmh.a(1.0F, 1.0F, 1.0F, 1.0F / (k + 1));
/* 340 */       int m = this.l;
/* 341 */       int n = this.m;
/* 342 */       float f1 = (k - j / 2) / 256.0F;
/* 343 */       localbmh.a(m, n, this.e, 0.0F + f1, 1.0D);
/* 344 */       localbmh.a(m, 0.0D, this.e, 1.0F + f1, 1.0D);
/* 345 */       localbmh.a(0.0D, 0.0D, this.e, 1.0F + f1, 0.0D);
/* 346 */       localbmh.a(0.0D, n, this.e, 0.0F + f1, 0.0D);
/*     */     }
/* 348 */     localbmh.a();
/* 349 */     GL11.glEnable(3008);
/*     */     
/* 351 */     GL11.glColorMask(true, true, true, true);
/*     */   }
/*     */   
/*     */   private void c(int paramInt1, int paramInt2, float paramFloat) {
/* 355 */     this.k.a().e();
/* 356 */     GL11.glViewport(0, 0, 256, 256);
/* 357 */     b(paramInt1, paramInt2, paramFloat);
/*     */     
/* 359 */     a(paramFloat);
/* 360 */     a(paramFloat);
/* 361 */     a(paramFloat);
/* 362 */     a(paramFloat);
/* 363 */     a(paramFloat);
/* 364 */     a(paramFloat);
/* 365 */     a(paramFloat);
/* 366 */     this.k.a().a(true);
/* 367 */     GL11.glViewport(0, 0, this.k.d, this.k.e);
/*     */     
/* 369 */     bmh localbmh = bmh.a;
/* 370 */     localbmh.b();
/*     */     
/* 372 */     float f1 = this.l > this.m ? 120.0F / this.l : 120.0F / this.m;
/* 373 */     float f2 = this.m * f1 / 256.0F;
/* 374 */     float f3 = this.l * f1 / 256.0F;
/* 375 */     localbmh.a(1.0F, 1.0F, 1.0F, 1.0F);
/* 376 */     int j = this.l;
/* 377 */     int k = this.m;
/* 378 */     localbmh.a(0.0D, k, this.e, 0.5F - f2, 0.5F + f3);
/* 379 */     localbmh.a(j, k, this.e, 0.5F - f2, 0.5F - f3);
/* 380 */     localbmh.a(j, 0.0D, this.e, 0.5F + f2, 0.5F - f3);
/* 381 */     localbmh.a(0.0D, 0.0D, this.e, 0.5F + f2, 0.5F + f3);
/* 382 */     localbmh.a();
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 387 */     GL11.glDisable(3008);
/* 388 */     c(paramInt1, paramInt2, paramFloat);
/* 389 */     GL11.glEnable(3008);
/* 390 */     bmh localbmh = bmh.a;
/*     */     
/* 392 */     int j = 274;
/* 393 */     int k = this.l / 2 - j / 2;
/* 394 */     int m = 30;
/*     */     
/* 396 */     a(0, 0, this.l, this.m, -2130706433, 16777215);
/* 397 */     a(0, 0, this.l, this.m, 0, Integer.MIN_VALUE);
/*     */     
/* 399 */     this.k.P().a(z);
/* 400 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 402 */     if (this.h < 1.0E-4D) {
/* 403 */       b(k + 0, m + 0, 0, 0, 99, 44);
/* 404 */       b(k + 99, m + 0, 129, 0, 27, 44);
/* 405 */       b(k + 99 + 26, m + 0, 126, 0, 3, 44);
/* 406 */       b(k + 99 + 26 + 3, m + 0, 99, 0, 26, 44);
/* 407 */       b(k + 155, m + 0, 0, 45, 155, 44);
/*     */     } else {
/* 409 */       b(k + 0, m + 0, 0, 0, 155, 44);
/* 410 */       b(k + 155, m + 0, 0, 45, 155, 44);
/*     */     }
/*     */     
/* 413 */     localbmh.c(-1);
/* 414 */     GL11.glPushMatrix();
/* 415 */     GL11.glTranslatef(this.l / 2 + 90, 70.0F, 0.0F);
/*     */     
/* 417 */     GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
/* 418 */     float f1 = 1.8F - qh.e(qh.a((float)(bao.K() % 1000L) / 1000.0F * 3.1415927F * 2.0F) * 0.1F);
/*     */     
/* 420 */     f1 = f1 * 100.0F / (this.q.a(this.i) + 32);
/* 421 */     GL11.glScalef(f1, f1, f1);
/* 422 */     a(this.q, this.i, 0, -8, 65280);
/* 423 */     GL11.glPopMatrix();
/*     */     
/* 425 */     String str1 = "Minecraft 1.7.10";
/* 426 */     if (this.k.u()) {
/* 427 */       str1 = str1 + " Demo";
/*     */     }
/*     */     
/* 430 */     b(this.q, str1, 2, this.m - 10, -1);
/* 431 */     String str2 = "Copyright Mojang AB. Do not distribute!";
/* 432 */     b(this.q, str2, this.l - this.q.a(str2) - 2, this.m - 10, -1);
/*     */     
/* 434 */     if ((this.v != null) && (this.v.length() > 0)) {
/* 435 */       a(this.D - 2, this.E - 2, this.F + 2, this.G - 1, 1428160512);
/*     */       
/* 437 */       b(this.q, this.v, this.D, this.E, -1);
/* 438 */       b(this.q, this.w, (this.l - this.B) / 2, ((bcb)this.n.get(0)).i - 12, -1);
/*     */     }
/*     */     
/* 441 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 446 */     super.a(paramInt1, paramInt2, paramInt3);
/*     */     
/* 448 */     synchronized (this.u) {
/* 449 */       if ((this.v.length() > 0) && (paramInt1 >= this.D) && (paramInt1 <= this.F) && (paramInt2 >= this.E) && (paramInt2 <= this.G)) {
/* 450 */         bcu localbcu = new bcu(this, this.x, 13, true);
/* 451 */         localbcu.f();
/* 452 */         this.k.a(localbcu);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */