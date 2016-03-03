/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.input.Keyboard;
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
/*     */ public class bfe
/*     */   extends bdw
/*     */ {
/*  24 */   private static final Logger a = ;
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
/*  35 */   private static final bqx f = new bqx("textures/gui/book.png");
/*     */   
/*     */   private final yz g;
/*     */   
/*     */   private final add h;
/*     */   
/*     */   private final boolean i;
/*     */   private boolean r;
/*     */   private boolean s;
/*     */   private int t;
/*  45 */   private int u = 192;
/*  46 */   private int v = 192;
/*     */   
/*  48 */   private int w = 1;
/*     */   private int x;
/*     */   private dq y;
/*  51 */   private String z = "";
/*     */   
/*     */   private bff A;
/*     */   private bff B;
/*     */   private bcb C;
/*     */   private bcb D;
/*     */   private bcb E;
/*     */   private bcb F;
/*     */   
/*     */   public bfe(yz paramyz, add paramadd, boolean paramBoolean)
/*     */   {
/*  62 */     this.g = paramyz;
/*  63 */     this.h = paramadd;
/*  64 */     this.i = paramBoolean;
/*     */     
/*  66 */     if (paramadd.p()) {
/*  67 */       dh localdh = paramadd.q();
/*  68 */       this.y = localdh.c("pages", 8);
/*  69 */       if (this.y != null) {
/*  70 */         this.y = ((dq)this.y.b());
/*  71 */         this.w = this.y.c();
/*  72 */         if (this.w < 1) {
/*  73 */           this.w = 1;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  78 */     if ((this.y == null) && (paramBoolean)) {
/*  79 */       this.y = new dq();
/*  80 */       this.y.a(new dx(""));
/*     */       
/*  82 */       this.w = 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  88 */     super.e();
/*  89 */     this.t += 1;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  94 */     this.n.clear();
/*  95 */     Keyboard.enableRepeatEvents(true);
/*     */     
/*  97 */     if (this.i) {
/*  98 */       this.n.add(this.D = new bcb(3, this.l / 2 - 100, 4 + this.v, 98, 20, brp.a("book.signButton", new Object[0])));
/*  99 */       this.n.add(this.C = new bcb(0, this.l / 2 + 2, 4 + this.v, 98, 20, brp.a("gui.done", new Object[0])));
/*     */       
/* 101 */       this.n.add(this.E = new bcb(5, this.l / 2 - 100, 4 + this.v, 98, 20, brp.a("book.finalizeButton", new Object[0])));
/* 102 */       this.n.add(this.F = new bcb(4, this.l / 2 + 2, 4 + this.v, 98, 20, brp.a("gui.cancel", new Object[0])));
/*     */     } else {
/* 104 */       this.n.add(this.C = new bcb(0, this.l / 2 - 100, 4 + this.v, 200, 20, brp.a("gui.done", new Object[0])));
/*     */     }
/*     */     
/* 107 */     int j = (this.l - this.u) / 2;
/* 108 */     int k = 2;
/*     */     
/* 110 */     this.n.add(this.A = new bff(1, j + 120, k + 154, true));
/* 111 */     this.n.add(this.B = new bff(2, j + 38, k + 154, false));
/*     */     
/* 113 */     f();
/*     */   }
/*     */   
/*     */   public void m()
/*     */   {
/* 118 */     Keyboard.enableRepeatEvents(false);
/*     */   }
/*     */   
/*     */   private void f() {
/* 122 */     this.A.m = ((!this.s) && ((this.x < this.w - 1) || (this.i)));
/* 123 */     this.B.m = ((!this.s) && (this.x > 0));
/*     */     
/* 125 */     this.C.m = ((!this.i) || (!this.s));
/* 126 */     if (this.i) {
/* 127 */       this.D.m = (!this.s);
/* 128 */       this.F.m = this.s;
/* 129 */       this.E.m = this.s;
/* 130 */       this.E.l = (this.z.trim().length() > 0);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(boolean paramBoolean)
/*     */   {
/* 136 */     if ((!this.i) || (!this.r)) {
/* 137 */       return;
/*     */     }
/*     */     
/* 140 */     if (this.y != null)
/*     */     {
/*     */ 
/* 143 */       while (this.y.c() > 1) {
/* 144 */         localObject1 = this.y.f(this.y.c() - 1);
/* 145 */         if (((String)localObject1).length() != 0) break;
/* 146 */         this.y.a(this.y.c() - 1);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 153 */       if (this.h.p()) {
/* 154 */         localObject1 = this.h.q();
/* 155 */         ((dh)localObject1).a("pages", this.y);
/*     */       } else {
/* 157 */         this.h.a("pages", this.y);
/*     */       }
/*     */       
/* 160 */       Object localObject1 = "MC|BEdit";
/* 161 */       if (paramBoolean) {
/* 162 */         localObject1 = "MC|BSign";
/* 163 */         this.h.a("author", new dx(this.g.b_()));
/* 164 */         this.h.a("title", new dx(this.z.trim()));
/*     */         
/*     */ 
/* 167 */         this.h.a(ade.bB);
/*     */       }
/*     */       
/* 170 */       ByteBuf localByteBuf = Unpooled.buffer();
/*     */       try
/*     */       {
/* 173 */         new et(localByteBuf).a(this.h);
/* 174 */         this.k.v().a(new iz((String)localObject1, localByteBuf));
/*     */       } catch (Exception localException) {
/* 176 */         a.error("Couldn't send book info", localException);
/*     */       } finally {
/* 178 */         localByteBuf.release();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/* 185 */     if (!parambcb.l) { return;
/*     */     }
/* 187 */     if (parambcb.k == 0) {
/* 188 */       this.k.a(null);
/* 189 */       a(false);
/*     */     }
/* 191 */     else if ((parambcb.k == 3) && (this.i)) {
/* 192 */       this.s = true;
/* 193 */     } else if (parambcb.k == 1) {
/* 194 */       if (this.x < this.w - 1) {
/* 195 */         this.x += 1;
/* 196 */       } else if (this.i) {
/* 197 */         g();
/*     */         
/* 199 */         if (this.x < this.w - 1) {
/* 200 */           this.x += 1;
/*     */         }
/*     */       }
/* 203 */     } else if (parambcb.k == 2) {
/* 204 */       if (this.x > 0) {
/* 205 */         this.x -= 1;
/*     */       }
/* 207 */     } else if ((parambcb.k == 5) && (this.s)) {
/* 208 */       a(true);
/* 209 */       this.k.a(null);
/* 210 */     } else if ((parambcb.k == 4) && (this.s)) {
/* 211 */       this.s = false;
/*     */     }
/* 213 */     f();
/*     */   }
/*     */   
/*     */   private void g() {
/* 217 */     if ((this.y == null) || (this.y.c() >= 50)) {
/* 218 */       return;
/*     */     }
/* 220 */     this.y.a(new dx(""));
/* 221 */     this.w += 1;
/*     */     
/* 223 */     this.r = true;
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/* 228 */     super.a(paramChar, paramInt);
/*     */     
/* 230 */     if (!this.i) {
/* 231 */       return;
/*     */     }
/*     */     
/* 234 */     if (this.s) {
/* 235 */       c(paramChar, paramInt);
/*     */     } else {
/* 237 */       b(paramChar, paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(char paramChar, int paramInt)
/*     */   {
/* 243 */     switch (paramChar) {
/*     */     case '\026': 
/* 245 */       b(bdw.o());
/* 246 */       return;
/*     */     }
/*     */     
/* 249 */     switch (paramInt) {
/*     */     case 14: 
/* 251 */       String str = h();
/* 252 */       if (str.length() > 0) {
/* 253 */         a(str.substring(0, str.length() - 1));
/*     */       }
/* 255 */       return;
/*     */     case 28: 
/*     */     case 156: 
/* 258 */       b("\n");
/* 259 */       return;
/*     */     }
/*     */     
/* 262 */     if (t.a(paramChar)) {
/* 263 */       b(Character.toString(paramChar));
/* 264 */       return;
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(char paramChar, int paramInt)
/*     */   {
/* 270 */     switch (paramInt) {
/*     */     case 14: 
/* 272 */       if (!this.z.isEmpty()) {
/* 273 */         this.z = this.z.substring(0, this.z.length() - 1);
/* 274 */         f();
/*     */       }
/* 276 */       return;
/*     */     case 28: 
/*     */     case 156: 
/* 279 */       if (!this.z.isEmpty()) {
/* 280 */         a(true);
/* 281 */         this.k.a(null);
/*     */       }
/* 283 */       return;
/*     */     }
/*     */     
/* 286 */     if ((this.z.length() < 16) && (t.a(paramChar))) {
/* 287 */       this.z += Character.toString(paramChar);
/* 288 */       f();
/* 289 */       this.r = true;
/*     */     }
/*     */   }
/*     */   
/*     */   private String h() {
/* 294 */     if ((this.y != null) && (this.x >= 0) && (this.x < this.y.c())) {
/* 295 */       return this.y.f(this.x);
/*     */     }
/* 297 */     return "";
/*     */   }
/*     */   
/*     */   private void a(String paramString) {
/* 301 */     if ((this.y != null) && (this.x >= 0) && (this.x < this.y.c())) {
/* 302 */       this.y.a(this.x, new dx(paramString));
/*     */       
/* 304 */       this.r = true;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private void b(String paramString)
/*     */   {
/* 311 */     String str1 = h();
/* 312 */     String str2 = str1 + paramString;
/*     */     
/* 314 */     int j = this.q.b(str2 + "" + a.a + "_", 118);
/* 315 */     if ((j <= 118) && (str2.length() < 256)) {
/* 316 */       a(str2);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 322 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 323 */     this.k.P().a(f);
/* 324 */     int j = (this.l - this.u) / 2;
/* 325 */     int k = 2;
/* 326 */     b(j, k, 0, 0, this.u, this.v);
/*     */     String str1;
/* 328 */     String str2; int m; if (this.s) {
/* 329 */       str1 = this.z;
/*     */       
/* 331 */       if (this.i) {
/* 332 */         if (this.t / 6 % 2 == 0) {
/* 333 */           str1 = str1 + "" + a.a + "_";
/*     */         } else {
/* 335 */           str1 = str1 + "" + a.h + "_";
/*     */         }
/*     */       }
/*     */       
/* 339 */       str2 = brp.a("book.editTitle", new Object[0]);
/* 340 */       m = this.q.a(str2);
/* 341 */       this.q.b(str2, j + 36 + (116 - m) / 2, k + 16 + 16, 0);
/*     */       
/* 343 */       int n = this.q.a(str1);
/* 344 */       this.q.b(str1, j + 36 + (116 - n) / 2, k + 48, 0);
/* 345 */       String str3 = brp.a("book.byAuthor", new Object[] { this.g.b_() });
/* 346 */       int i1 = this.q.a(str3);
/* 347 */       this.q.b(a.i + str3, j + 36 + (116 - i1) / 2, k + 48 + 10, 0);
/*     */       
/* 349 */       String str4 = brp.a("book.finalizeWarning", new Object[0]);
/* 350 */       this.q.a(str4, j + 36, k + 80, 116, 0);
/*     */     } else {
/* 352 */       str1 = brp.a("book.pageIndicator", new Object[] { Integer.valueOf(this.x + 1), Integer.valueOf(this.w) });
/* 353 */       str2 = "";
/*     */       
/* 355 */       if ((this.y != null) && (this.x >= 0) && (this.x < this.y.c())) {
/* 356 */         str2 = this.y.f(this.x);
/*     */       }
/*     */       
/* 359 */       if (this.i) {
/* 360 */         if (this.q.b()) {
/* 361 */           str2 = str2 + "_";
/*     */         }
/* 363 */         else if (this.t / 6 % 2 == 0) {
/* 364 */           str2 = str2 + "" + a.a + "_";
/*     */         } else {
/* 366 */           str2 = str2 + "" + a.h + "_";
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 371 */       m = this.q.a(str1);
/* 372 */       this.q.b(str1, j - m + this.u - 44, k + 16, 0);
/* 373 */       this.q.a(str2, j + 36, k + 16 + 16, 116, 0);
/*     */     }
/*     */     
/* 376 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */