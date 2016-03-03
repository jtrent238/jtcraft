/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ 
/*     */ 
/*     */ public class bfz
/*     */   extends bdw
/*     */   implements bcv
/*     */ {
/*  23 */   private static final Logger a = ;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  33 */   private final bjq f = new bjq();
/*     */   private bdw g;
/*     */   private bge h;
/*     */   private bjp i;
/*     */   private bcb r;
/*     */   private bcb s;
/*     */   private bcb t;
/*     */   private boolean u;
/*     */   private boolean v;
/*     */   private boolean w;
/*     */   private boolean x;
/*     */   private String y;
/*     */   private bjn z;
/*     */   private btd A;
/*     */   private btc B;
/*     */   private boolean C;
/*     */   
/*     */   public bfz(bdw parambdw)
/*     */   {
/*  52 */     this.g = parambdw;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  57 */     Keyboard.enableRepeatEvents(true);
/*  58 */     this.n.clear();
/*     */     
/*  60 */     if (!this.C) {
/*  61 */       this.C = true;
/*     */       
/*  63 */       this.i = new bjp(this.k);
/*  64 */       this.i.a();
/*     */       
/*  66 */       this.A = new btd();
/*     */       try {
/*  68 */         this.B = new btc(this.A);
/*  69 */         this.B.start();
/*     */       } catch (Exception localException) {
/*  71 */         a.warn("Unable to start LAN server detection: " + localException.getMessage());
/*     */       }
/*     */       
/*  74 */       this.h = new bge(this, this.k, this.l, this.m, 32, this.m - 64, 36);
/*  75 */       this.h.a(this.i);
/*     */     } else {
/*  77 */       this.h.a(this.l, this.m, 32, this.m - 64);
/*     */     }
/*     */     
/*  80 */     a();
/*     */   }
/*     */   
/*     */   public void a() {
/*  84 */     this.n.add(this.r = new bcb(7, this.l / 2 - 154, this.m - 28, 70, 20, brp.a("selectServer.edit", new Object[0])));
/*  85 */     this.n.add(this.t = new bcb(2, this.l / 2 - 74, this.m - 28, 70, 20, brp.a("selectServer.delete", new Object[0])));
/*     */     
/*  87 */     this.n.add(this.s = new bcb(1, this.l / 2 - 154, this.m - 52, 100, 20, brp.a("selectServer.select", new Object[0])));
/*  88 */     this.n.add(new bcb(4, this.l / 2 - 50, this.m - 52, 100, 20, brp.a("selectServer.direct", new Object[0])));
/*  89 */     this.n.add(new bcb(3, this.l / 2 + 4 + 50, this.m - 52, 100, 20, brp.a("selectServer.add", new Object[0])));
/*     */     
/*  91 */     this.n.add(new bcb(8, this.l / 2 + 4, this.m - 28, 70, 20, brp.a("selectServer.refresh", new Object[0])));
/*  92 */     this.n.add(new bcb(0, this.l / 2 + 4 + 76, this.m - 28, 75, 20, brp.a("gui.cancel", new Object[0])));
/*     */     
/*  94 */     b(this.h.k());
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  99 */     super.e();
/*     */     
/* 101 */     if (this.A.a()) {
/* 102 */       List localList = this.A.c();
/* 103 */       this.A.b();
/*     */       
/* 105 */       this.h.a(localList);
/*     */     }
/*     */     
/* 108 */     this.f.a();
/*     */   }
/*     */   
/*     */   public void m()
/*     */   {
/* 113 */     Keyboard.enableRepeatEvents(false);
/* 114 */     if (this.B != null) {
/* 115 */       this.B.interrupt();
/* 116 */       this.B = null;
/*     */     }
/* 118 */     this.f.b();
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/* 123 */     if (!parambcb.l) { return;
/*     */     }
/* 125 */     bci localbci = this.h.k() < 0 ? null : this.h.b(this.h.k());
/*     */     Object localObject;
/* 127 */     if ((parambcb.k == 2) && ((localbci instanceof bgc))) {
/* 128 */       localObject = ((bgc)localbci).a().a;
/* 129 */       if (localObject != null) {
/* 130 */         this.u = true;
/*     */         
/* 132 */         String str1 = brp.a("selectServer.deleteQuestion", new Object[0]);
/* 133 */         String str2 = "'" + (String)localObject + "' " + brp.a("selectServer.deleteWarning", new Object[0]);
/* 134 */         String str3 = brp.a("selectServer.deleteButton", new Object[0]);
/* 135 */         String str4 = brp.a("gui.cancel", new Object[0]);
/*     */         
/* 137 */         bcw localbcw = new bcw(this, str1, str2, str3, str4, this.h.k());
/* 138 */         this.k.a(localbcw);
/*     */       }
/* 140 */     } else if (parambcb.k == 1) {
/* 141 */       f();
/* 142 */     } else if (parambcb.k == 4) {
/* 143 */       this.x = true;
/* 144 */       this.k.a(new bde(this, this.z = new bjn(brp.a("selectServer.defaultName", new Object[0]), "")));
/* 145 */     } else if (parambcb.k == 3) {
/* 146 */       this.v = true;
/* 147 */       this.k.a(new bdg(this, this.z = new bjn(brp.a("selectServer.defaultName", new Object[0]), "")));
/* 148 */     } else if ((parambcb.k == 7) && ((localbci instanceof bgc))) {
/* 149 */       this.w = true;
/* 150 */       localObject = ((bgc)localbci).a();
/*     */       
/* 152 */       this.z = new bjn(((bjn)localObject).a, ((bjn)localObject).b);
/* 153 */       this.z.a((bjn)localObject);
/*     */       
/* 155 */       this.k.a(new bdg(this, this.z));
/* 156 */     } else if (parambcb.k == 0) {
/* 157 */       this.k.a(this.g);
/* 158 */     } else if (parambcb.k == 8) {
/* 159 */       i();
/*     */     }
/*     */   }
/*     */   
/*     */   private void i() {
/* 164 */     this.k.a(new bfz(this.g));
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean, int paramInt)
/*     */   {
/* 169 */     bci localbci = this.h.k() < 0 ? null : this.h.b(this.h.k());
/*     */     
/* 171 */     if (this.u) {
/* 172 */       this.u = false;
/* 173 */       if ((paramBoolean) && ((localbci instanceof bgc))) {
/* 174 */         this.i.b(this.h.k());
/* 175 */         this.i.b();
/* 176 */         this.h.c(-1);
/* 177 */         this.h.a(this.i);
/*     */       }
/* 179 */       this.k.a(this);
/* 180 */     } else if (this.x) {
/* 181 */       this.x = false;
/* 182 */       if (paramBoolean) {
/* 183 */         a(this.z);
/*     */       } else {
/* 185 */         this.k.a(this);
/*     */       }
/* 187 */     } else if (this.v) {
/* 188 */       this.v = false;
/* 189 */       if (paramBoolean) {
/* 190 */         this.i.a(this.z);
/* 191 */         this.i.b();
/* 192 */         this.h.c(-1);
/* 193 */         this.h.a(this.i);
/*     */       }
/* 195 */       this.k.a(this);
/* 196 */     } else if (this.w) {
/* 197 */       this.w = false;
/* 198 */       if ((paramBoolean) && ((localbci instanceof bgc))) {
/* 199 */         bjn localbjn = ((bgc)localbci).a();
/* 200 */         localbjn.a = this.z.a;
/* 201 */         localbjn.b = this.z.b;
/* 202 */         localbjn.a(this.z);
/* 203 */         this.i.b();
/* 204 */         this.h.a(this.i);
/*     */       }
/* 206 */       this.k.a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/* 212 */     int j = this.h.k();
/* 213 */     bci localbci = j < 0 ? null : this.h.b(j);
/*     */     
/* 215 */     if (paramInt == 63) {
/* 216 */       i();
/* 217 */       return;
/*     */     }
/*     */     
/* 220 */     if (j >= 0) {
/* 221 */       if (paramInt == 200) {
/* 222 */         if (r()) {
/* 223 */           if ((j > 0) && ((localbci instanceof bgc))) {
/* 224 */             this.i.a(j, j - 1);
/* 225 */             b(this.h.k() - 1);
/* 226 */             this.h.f(-this.h.j());
/* 227 */             this.h.a(this.i);
/*     */           }
/* 229 */         } else if (j > 0) {
/* 230 */           b(this.h.k() - 1);
/* 231 */           this.h.f(-this.h.j());
/*     */           
/* 233 */           if ((this.h.b(this.h.k()) instanceof bga)) {
/* 234 */             if (this.h.k() > 0) {
/* 235 */               b(this.h.b() - 1);
/* 236 */               this.h.f(-this.h.j());
/*     */             } else {
/* 238 */               b(-1);
/*     */             }
/*     */           }
/*     */         } else {
/* 242 */           b(-1);
/*     */         }
/* 244 */       } else if (paramInt == 208) {
/* 245 */         if (r()) {
/* 246 */           if (j < this.i.c() - 1) {
/* 247 */             this.i.a(j, j + 1);
/* 248 */             b(j + 1);
/* 249 */             this.h.f(this.h.j());
/* 250 */             this.h.a(this.i);
/*     */           }
/* 252 */         } else if (j < this.h.b()) {
/* 253 */           b(this.h.k() + 1);
/* 254 */           this.h.f(this.h.j());
/*     */           
/* 256 */           if ((this.h.b(this.h.k()) instanceof bga)) {
/* 257 */             if (this.h.k() < this.h.b() - 1) {
/* 258 */               b(this.h.b() + 1);
/* 259 */               this.h.f(this.h.j());
/*     */             } else {
/* 261 */               b(-1);
/*     */             }
/*     */           }
/*     */         } else {
/* 265 */           b(-1);
/*     */         }
/* 267 */       } else if ((paramInt == 28) || (paramInt == 156)) {
/* 268 */         a((bcb)this.n.get(2));
/*     */       } else {
/* 270 */         super.a(paramChar, paramInt);
/*     */       }
/*     */     } else {
/* 273 */       super.a(paramChar, paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 279 */     this.y = null;
/*     */     
/* 281 */     c();
/*     */     
/* 283 */     this.h.a(paramInt1, paramInt2, paramFloat);
/* 284 */     a(this.q, brp.a("multiplayer.title", new Object[0]), this.l / 2, 20, 16777215);
/*     */     
/* 286 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */     
/* 288 */     if (this.y != null) {
/* 289 */       a(Lists.newArrayList(Splitter.on("\n").split(this.y)), paramInt1, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   public void f() {
/* 294 */     bci localbci = this.h.k() < 0 ? null : this.h.b(this.h.k());
/*     */     
/* 296 */     if ((localbci instanceof bgc)) {
/* 297 */       a(((bgc)localbci).a());
/* 298 */     } else if ((localbci instanceof bgb)) {
/* 299 */       btb localbtb = ((bgb)localbci).a();
/* 300 */       a(new bjn(localbtb.a(), localbtb.b(), true));
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(bjn parambjn) {
/* 305 */     this.k.a(new bcx(this, this.k, parambjn));
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
/*     */   public void b(int paramInt)
/*     */   {
/* 322 */     this.h.c(paramInt);
/*     */     
/* 324 */     bci localbci = paramInt < 0 ? null : this.h.b(paramInt);
/* 325 */     this.s.l = false;
/* 326 */     this.r.l = false;
/* 327 */     this.t.l = false;
/*     */     
/* 329 */     if ((localbci != null) && (!(localbci instanceof bga))) {
/* 330 */       this.s.l = true;
/* 331 */       if ((localbci instanceof bgc)) {
/* 332 */         this.r.l = true;
/* 333 */         this.t.l = true;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public bjq g() {
/* 339 */     return this.f;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 343 */     this.y = paramString;
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 348 */     super.a(paramInt1, paramInt2, paramInt3);
/* 349 */     this.h.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 354 */     super.b(paramInt1, paramInt2, paramInt3);
/* 355 */     this.h.b(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public bjp h() {
/* 359 */     return this.i;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */