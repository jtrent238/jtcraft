/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import org.lwjgl.input.Keyboard;
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
/*     */ public class bdb
/*     */   extends bdw
/*     */ {
/*     */   private bdw f;
/*     */   private bcd g;
/*     */   private bcd h;
/*     */   private String i;
/*  21 */   private String r = "survival";
/*  22 */   private boolean s = true;
/*     */   
/*     */   private boolean t;
/*     */   
/*     */   private boolean u;
/*     */   
/*     */   private boolean v;
/*     */   
/*     */   private boolean w;
/*     */   
/*     */   private boolean x;
/*     */   
/*     */   private boolean y;
/*     */   
/*     */   private bcb z;
/*     */   
/*     */   private bcb A;
/*     */   
/*     */   private bcb B;
/*     */   
/*     */   private bcb C;
/*     */   
/*     */   private bcb D;
/*     */   
/*     */   private bcb E;
/*     */   private bcb F;
/*     */   private String G;
/*     */   private String H;
/*     */   private String I;
/*     */   private String J;
/*     */   private int K;
/*  53 */   public String a = "";
/*     */   
/*     */   public bdb(bdw parambdw) {
/*  56 */     this.f = parambdw;
/*     */     
/*  58 */     this.I = "";
/*  59 */     this.J = brp.a("selectWorld.newWorld", new Object[0]);
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  64 */     this.g.a();
/*  65 */     this.h.a();
/*     */   }
/*     */   
/*     */ 
/*     */   public void b()
/*     */   {
/*  71 */     Keyboard.enableRepeatEvents(true);
/*  72 */     this.n.clear();
/*  73 */     this.n.add(new bcb(0, this.l / 2 - 155, this.m - 28, 150, 20, brp.a("selectWorld.create", new Object[0])));
/*  74 */     this.n.add(new bcb(1, this.l / 2 + 5, this.m - 28, 150, 20, brp.a("gui.cancel", new Object[0])));
/*     */     
/*  76 */     this.n.add(this.z = new bcb(2, this.l / 2 - 75, 115, 150, 20, brp.a("selectWorld.gameMode", new Object[0])));
/*  77 */     this.n.add(this.A = new bcb(3, this.l / 2 - 75, 187, 150, 20, brp.a("selectWorld.moreWorldOptions", new Object[0])));
/*     */     
/*  79 */     this.n.add(this.B = new bcb(4, this.l / 2 - 155, 100, 150, 20, brp.a("selectWorld.mapFeatures", new Object[0])));
/*  80 */     this.B.m = false;
/*  81 */     this.n.add(this.C = new bcb(7, this.l / 2 + 5, 151, 150, 20, brp.a("selectWorld.bonusItems", new Object[0])));
/*  82 */     this.C.m = false;
/*  83 */     this.n.add(this.D = new bcb(5, this.l / 2 + 5, 100, 150, 20, brp.a("selectWorld.mapType", new Object[0])));
/*  84 */     this.D.m = false;
/*  85 */     this.n.add(this.E = new bcb(6, this.l / 2 - 155, 151, 150, 20, brp.a("selectWorld.allowCommands", new Object[0])));
/*  86 */     this.E.m = false;
/*  87 */     this.n.add(this.F = new bcb(8, this.l / 2 + 5, 120, 150, 20, brp.a("selectWorld.customizeType", new Object[0])));
/*  88 */     this.F.m = false;
/*     */     
/*  90 */     this.g = new bcd(this.q, this.l / 2 - 100, 60, 200, 20);
/*  91 */     this.g.b(true);
/*  92 */     this.g.a(this.J);
/*     */     
/*  94 */     this.h = new bcd(this.q, this.l / 2 - 100, 60, 200, 20);
/*  95 */     this.h.a(this.I);
/*     */     
/*  97 */     a(this.y);
/*     */     
/*  99 */     a();
/* 100 */     f();
/*     */   }
/*     */   
/*     */   private void a() {
/* 104 */     this.i = this.g.b().trim();
/*     */     
/* 106 */     for (char c : t.a) {
/* 107 */       this.i = this.i.replace(c, '_');
/*     */     }
/*     */     
/* 110 */     if (qh.a(this.i)) {
/* 111 */       this.i = "World";
/*     */     }
/* 113 */     this.i = a(this.k.d(), this.i);
/*     */   }
/*     */   
/*     */   private void f() {
/* 117 */     this.z.j = (brp.a("selectWorld.gameMode", new Object[0]) + " " + brp.a(new StringBuilder().append("selectWorld.gameMode.").append(this.r).toString(), new Object[0]));
/* 118 */     this.G = brp.a("selectWorld.gameMode." + this.r + ".line1", new Object[0]);
/* 119 */     this.H = brp.a("selectWorld.gameMode." + this.r + ".line2", new Object[0]);
/*     */     
/* 121 */     this.B.j = (brp.a("selectWorld.mapFeatures", new Object[0]) + " ");
/* 122 */     if (this.s) {
/* 123 */       this.B.j += brp.a("options.on", new Object[0]);
/*     */     } else {
/* 125 */       this.B.j += brp.a("options.off", new Object[0]);
/*     */     }
/* 127 */     this.C.j = (brp.a("selectWorld.bonusItems", new Object[0]) + " ");
/* 128 */     if ((this.v) && (!this.w)) {
/* 129 */       this.C.j += brp.a("options.on", new Object[0]);
/*     */     } else {
/* 131 */       this.C.j += brp.a("options.off", new Object[0]);
/*     */     }
/* 133 */     this.D.j = (brp.a("selectWorld.mapType", new Object[0]) + " " + brp.a(ahm.a[this.K].b(), new Object[0]));
/*     */     
/* 135 */     this.E.j = (brp.a("selectWorld.allowCommands", new Object[0]) + " ");
/* 136 */     if ((this.t) && (!this.w)) {
/* 137 */       this.E.j += brp.a("options.on", new Object[0]);
/*     */     } else {
/* 139 */       this.E.j += brp.a("options.off", new Object[0]);
/*     */     }
/*     */   }
/*     */   
/* 143 */   private static final String[] L = { "CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9" };
/*     */   
/*     */ 
/*     */   public static String a(aze paramaze, String paramString)
/*     */   {
/* 148 */     paramString = paramString.replaceAll("[\\./\"]", "_");
/* 149 */     for (String str : L) {
/* 150 */       if (paramString.equalsIgnoreCase(str)) {
/* 151 */         paramString = "_" + paramString + "_";
/*     */       }
/*     */     }
/* 154 */     while (paramaze.c(paramString) != null) {
/* 155 */       paramString = paramString + "-";
/*     */     }
/* 157 */     return paramString;
/*     */   }
/*     */   
/*     */   public void m()
/*     */   {
/* 162 */     Keyboard.enableRepeatEvents(false);
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/* 167 */     if (!parambcb.l) { return;
/*     */     }
/* 169 */     if (parambcb.k == 1) {
/* 170 */       this.k.a(this.f);
/* 171 */     } else if (parambcb.k == 0)
/*     */     {
/* 173 */       this.k.a(null);
/* 174 */       if (this.x) return;
/* 175 */       this.x = true;
/*     */       
/* 177 */       long l1 = new Random().nextLong();
/* 178 */       String str = this.h.b();
/*     */       
/* 180 */       if (!qh.a(str)) {
/*     */         try
/*     */         {
/* 183 */           long l2 = Long.parseLong(str);
/* 184 */           if (l2 != 0L) {
/* 185 */             l1 = l2;
/*     */           }
/*     */         }
/*     */         catch (NumberFormatException localNumberFormatException) {
/* 189 */           l1 = str.hashCode();
/*     */         }
/*     */       }
/*     */       
/* 193 */       ahk localahk = ahk.a(this.r);
/* 194 */       ahj localahj = new ahj(l1, localahk, this.s, this.w, ahm.a[this.K]);
/* 195 */       localahj.a(this.a);
/* 196 */       if ((this.v) && (!this.w)) {
/* 197 */         localahj.a();
/*     */       }
/* 199 */       if ((this.t) && (!this.w)) {
/* 200 */         localahj.b();
/*     */       }
/* 202 */       this.k.a(this.i, this.g.b().trim(), localahj);
/* 203 */     } else if (parambcb.k == 3) {
/* 204 */       g();
/* 205 */     } else if (parambcb.k == 2) {
/* 206 */       if (this.r.equals("survival")) {
/* 207 */         if (!this.u) this.t = false;
/* 208 */         this.w = false;
/* 209 */         this.r = "hardcore";
/* 210 */         this.w = true;
/* 211 */         this.E.l = false;
/* 212 */         this.C.l = false;
/* 213 */         f();
/* 214 */       } else if (this.r.equals("hardcore")) {
/* 215 */         if (!this.u) this.t = true;
/* 216 */         this.w = false;
/* 217 */         this.r = "creative";
/* 218 */         f();
/* 219 */         this.w = false;
/* 220 */         this.E.l = true;
/* 221 */         this.C.l = true;
/*     */       } else {
/* 223 */         if (!this.u) this.t = false;
/* 224 */         this.r = "survival";
/* 225 */         f();
/* 226 */         this.E.l = true;
/* 227 */         this.C.l = true;
/* 228 */         this.w = false;
/*     */       }
/* 230 */       f();
/* 231 */     } else if (parambcb.k == 4) {
/* 232 */       this.s = (!this.s);
/* 233 */       f();
/* 234 */     } else if (parambcb.k == 7) {
/* 235 */       this.v = (!this.v);
/* 236 */       f();
/* 237 */     } else if (parambcb.k == 5) {
/* 238 */       this.K += 1;
/* 239 */       if (this.K >= ahm.a.length) {
/* 240 */         this.K = 0;
/*     */       }
/* 242 */       while ((ahm.a[this.K] == null) || (!ahm.a[this.K].e())) {
/* 243 */         this.K += 1;
/* 244 */         if (this.K >= ahm.a.length) {
/* 245 */           this.K = 0;
/*     */         }
/*     */       }
/* 248 */       this.a = "";
/* 249 */       f();
/* 250 */       a(this.y);
/* 251 */     } else if (parambcb.k == 6) {
/* 252 */       this.u = true;
/* 253 */       this.t = (!this.t);
/* 254 */       f();
/* 255 */     } else if (parambcb.k == 8) {
/* 256 */       this.k.a(new bcz(this, this.a));
/*     */     }
/*     */   }
/*     */   
/*     */   private void g() {
/* 261 */     a(!this.y);
/*     */   }
/*     */   
/*     */   private void a(boolean paramBoolean) {
/* 265 */     this.y = paramBoolean;
/*     */     
/* 267 */     this.z.m = (!this.y);
/* 268 */     this.B.m = this.y;
/* 269 */     this.C.m = this.y;
/* 270 */     this.D.m = this.y;
/* 271 */     this.E.m = this.y;
/* 272 */     this.F.m = ((this.y) && (ahm.a[this.K] == ahm.c));
/*     */     
/* 274 */     if (this.y) {
/* 275 */       this.A.j = brp.a("gui.done", new Object[0]);
/*     */     } else {
/* 277 */       this.A.j = brp.a("selectWorld.moreWorldOptions", new Object[0]);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/* 283 */     if ((this.g.l()) && (!this.y)) {
/* 284 */       this.g.a(paramChar, paramInt);
/* 285 */       this.J = this.g.b();
/* 286 */     } else if ((this.h.l()) && (this.y)) {
/* 287 */       this.h.a(paramChar, paramInt);
/* 288 */       this.I = this.h.b();
/*     */     }
/*     */     
/* 291 */     if ((paramInt == 28) || (paramInt == 156)) {
/* 292 */       a((bcb)this.n.get(0));
/*     */     }
/* 294 */     ((bcb)this.n.get(0)).l = (this.g.b().length() > 0);
/*     */     
/* 296 */     a();
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 301 */     super.a(paramInt1, paramInt2, paramInt3);
/*     */     
/* 303 */     if (this.y) {
/* 304 */       this.h.a(paramInt1, paramInt2, paramInt3);
/*     */     } else {
/* 306 */       this.g.a(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 312 */     c();
/*     */     
/* 314 */     a(this.q, brp.a("selectWorld.create", new Object[0]), this.l / 2, 20, -1);
/* 315 */     if (this.y) {
/* 316 */       b(this.q, brp.a("selectWorld.enterSeed", new Object[0]), this.l / 2 - 100, 47, -6250336);
/* 317 */       b(this.q, brp.a("selectWorld.seedInfo", new Object[0]), this.l / 2 - 100, 85, -6250336);
/* 318 */       b(this.q, brp.a("selectWorld.mapFeatures.info", new Object[0]), this.l / 2 - 150, 122, -6250336);
/* 319 */       b(this.q, brp.a("selectWorld.allowCommands.info", new Object[0]), this.l / 2 - 150, 172, -6250336);
/* 320 */       this.h.f();
/*     */       
/* 322 */       if (ahm.a[this.K].h()) {
/* 323 */         this.q.a(brp.a(ahm.a[this.K].c(), new Object[0]), this.D.h + 2, this.D.i + 22, this.D.b(), 10526880);
/*     */       }
/*     */     } else {
/* 326 */       b(this.q, brp.a("selectWorld.enterName", new Object[0]), this.l / 2 - 100, 47, -6250336);
/* 327 */       b(this.q, brp.a("selectWorld.resultFolder", new Object[0]) + " " + this.i, this.l / 2 - 100, 85, -6250336);
/* 328 */       this.g.f();
/*     */       
/* 330 */       b(this.q, this.G, this.l / 2 - 100, 137, -6250336);
/* 331 */       b(this.q, this.H, this.l / 2 - 100, 149, -6250336);
/*     */     }
/*     */     
/* 334 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */   
/*     */   public void a(ays paramays) {
/* 338 */     this.J = brp.a("selectWorld.newWorld.copyOf", new Object[] { paramays.k() });
/* 339 */     this.I = (paramays.b() + "");
/* 340 */     this.K = paramays.u().g();
/* 341 */     this.a = paramays.y();
/* 342 */     this.s = paramays.s();
/* 343 */     this.t = paramays.v();
/*     */     
/* 345 */     if (paramays.t()) {
/* 346 */       this.r = "hardcore";
/* 347 */     } else if (paramays.r().e()) {
/* 348 */       this.r = "survival";
/* 349 */     } else if (paramays.r().d()) {
/* 350 */       this.r = "creative";
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bdb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */