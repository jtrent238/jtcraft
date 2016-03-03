/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bsx
/*     */   extends MinecraftServer
/*     */ {
/*  30 */   private static final Logger i = ;
/*     */   private final bao j;
/*     */   private final ahj k;
/*     */   private boolean l;
/*     */   private boolean m;
/*     */   private bte n;
/*     */   
/*     */   public bsx(bao parambao, String paramString1, String paramString2, ahj paramahj) {
/*  38 */     super(new File(parambao.w, "saves"), parambao.O());
/*     */     
/*  40 */     j(parambao.M().c());
/*  41 */     k(paramString1);
/*  42 */     l(paramString2);
/*  43 */     b(parambao.u());
/*  44 */     c(paramahj.c());
/*  45 */     c(256);
/*  46 */     a(new bsw(this));
/*     */     
/*  48 */     this.j = parambao;
/*  49 */     this.k = paramahj;
/*     */   }
/*     */   
/*     */   protected void a(String paramString1, String paramString2, long paramLong, ahm paramahm, String paramString3)
/*     */   {
/*  54 */     a(paramString1);
/*     */     
/*  56 */     this.c = new mt[3];
/*  57 */     this.h = new long[this.c.length][100];
/*     */     
/*  59 */     azc localazc = S().a(paramString1, true);
/*     */     
/*  61 */     for (int i1 = 0; i1 < this.c.length; i1++) {
/*  62 */       int i2 = 0;
/*  63 */       if (i1 == 1) i2 = -1;
/*  64 */       if (i1 == 2) { i2 = 1;
/*     */       }
/*  66 */       if (i1 == 0) {
/*  67 */         if (R()) {
/*  68 */           this.c[i1] = new mk(this, localazc, paramString2, i2, this.b);
/*     */         } else {
/*  70 */           this.c[i1] = new mt(this, localazc, paramString2, i2, this.k, this.b);
/*     */         }
/*     */       } else {
/*  73 */         this.c[i1] = new mm(this, localazc, paramString2, i2, this.k, this.c[0], this.b);
/*     */       }
/*     */       
/*  76 */       this.c[i1].a(new mp(this, this.c[i1]));
/*     */       
/*  78 */       ah().a(this.c);
/*     */     }
/*     */     
/*  81 */     a(j());
/*     */     
/*  83 */     g();
/*     */   }
/*     */   
/*     */   protected boolean e()
/*     */   {
/*  88 */     i.info("Starting integrated minecraft server version 1.7.10");
/*     */     
/*  90 */     d(true);
/*  91 */     e(true);
/*  92 */     f(true);
/*  93 */     g(true);
/*  94 */     h(true);
/*     */     
/*  96 */     i.info("Generating keypair");
/*  97 */     a(pt.b());
/*     */     
/*  99 */     a(O(), P(), this.k.d(), this.k.h(), this.k.j());
/* 100 */     n(M() + " - " + this.c[0].N().k());
/*     */     
/* 102 */     return true;
/*     */   }
/*     */   
/*     */   protected void u()
/*     */   {
/* 107 */     boolean bool = this.l;
/* 108 */     this.l = ((bao.B().v() != null) && (bao.B().V()));
/*     */     
/* 110 */     if ((!bool) && (this.l)) {
/* 111 */       i.info("Saving and pausing game...");
/* 112 */       ah().j();
/* 113 */       a(false);
/*     */     }
/*     */     
/* 116 */     if (!this.l) {
/* 117 */       super.u();
/*     */       
/* 119 */       if (this.j.u.c != ah().s()) {
/* 120 */         i.info("Changing view distance to {}, from {}", new Object[] { Integer.valueOf(this.j.u.c), Integer.valueOf(ah().s()) });
/* 121 */         ah().a(this.j.u.c);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean h()
/*     */   {
/* 128 */     return false;
/*     */   }
/*     */   
/*     */   public ahk i()
/*     */   {
/* 133 */     return this.k.e();
/*     */   }
/*     */   
/*     */   public rd j()
/*     */   {
/* 138 */     return this.j.u.au;
/*     */   }
/*     */   
/*     */   public boolean k()
/*     */   {
/* 143 */     return this.k.f();
/*     */   }
/*     */   
/*     */   public boolean m()
/*     */   {
/* 148 */     return false;
/*     */   }
/*     */   
/*     */   protected File s()
/*     */   {
/* 153 */     return this.j.w;
/*     */   }
/*     */   
/*     */   public boolean X()
/*     */   {
/* 158 */     return false;
/*     */   }
/*     */   
/*     */   protected void a(b paramb)
/*     */   {
/* 163 */     this.j.a(paramb);
/*     */   }
/*     */   
/*     */   public b b(b paramb)
/*     */   {
/* 168 */     paramb = super.b(paramb);
/*     */     
/* 170 */     paramb.g().a("Type", new bsy(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */     paramb.g().a("Is Modded", new bsz(this));
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
/* 191 */     return paramb;
/*     */   }
/*     */   
/*     */   public void a(ri paramri)
/*     */   {
/* 196 */     super.a(paramri);
/*     */     
/* 198 */     paramri.a("snooper_partner", this.j.J().f());
/*     */   }
/*     */   
/*     */   public boolean W()
/*     */   {
/* 203 */     return bao.B().W();
/*     */   }
/*     */   
/*     */   public String a(ahk paramahk, boolean paramBoolean)
/*     */   {
/*     */     try {
/* 209 */       int i1 = -1;
/*     */       try
/*     */       {
/* 212 */         i1 = pv.a();
/*     */       }
/*     */       catch (IOException localIOException2) {}
/* 215 */       if (i1 <= 0) { i1 = 25564;
/*     */       }
/* 217 */       ai().a(null, i1);
/* 218 */       i.info("Started on " + i1);
/* 219 */       this.m = true;
/*     */       
/* 221 */       this.n = new bte(ae(), i1 + "");
/* 222 */       this.n.start();
/*     */       
/* 224 */       ah().a(paramahk);
/* 225 */       ah().c(paramBoolean);
/*     */       
/* 227 */       return i1 + "";
/*     */     }
/*     */     catch (IOException localIOException1) {}
/* 230 */     return null;
/*     */   }
/*     */   
/*     */   public void o()
/*     */   {
/* 235 */     super.o();
/*     */     
/* 237 */     if (this.n != null) {
/* 238 */       this.n.interrupt();
/* 239 */       this.n = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public void r()
/*     */   {
/* 245 */     super.r();
/*     */     
/* 247 */     if (this.n != null) {
/* 248 */       this.n.interrupt();
/* 249 */       this.n = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 254 */     return this.m;
/*     */   }
/*     */   
/*     */   public void a(ahk paramahk)
/*     */   {
/* 259 */     ah().a(paramahk);
/*     */   }
/*     */   
/*     */   public boolean ad()
/*     */   {
/* 264 */     return true;
/*     */   }
/*     */   
/*     */   public int l()
/*     */   {
/* 269 */     return 4;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bsx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */