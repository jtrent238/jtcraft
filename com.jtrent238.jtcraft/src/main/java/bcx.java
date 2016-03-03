/*     */ import java.util.List;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
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
/*     */ public class bcx
/*     */   extends bdw
/*     */ {
/*  19 */   private static final AtomicInteger a = new AtomicInteger(0);
/*  20 */   private static final Logger f = LogManager.getLogger();
/*     */   private ej g;
/*     */   private boolean h;
/*     */   private final bdw i;
/*     */   
/*     */   public bcx(bdw parambdw, bao parambao, bjn parambjn)
/*     */   {
/*  27 */     this.k = parambao;
/*  28 */     this.i = parambdw;
/*  29 */     bjm localbjm = bjm.a(parambjn.b);
/*     */     
/*  31 */     parambao.a(null);
/*  32 */     parambao.a(parambjn);
/*  33 */     a(localbjm.a(), localbjm.b());
/*     */   }
/*     */   
/*     */   public bcx(bdw parambdw, bao parambao, String paramString, int paramInt) {
/*  37 */     this.k = parambao;
/*  38 */     this.i = parambdw;
/*  39 */     parambao.a(null);
/*  40 */     a(paramString, paramInt);
/*     */   }
/*     */   
/*     */   private void a(String paramString, int paramInt) {
/*  44 */     f.info("Connecting to " + paramString + ", " + paramInt);
/*  45 */     new bcy(this, "Server Connector #" + a.incrementAndGet(), paramString, paramInt).start();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void e()
/*     */   {
/*  76 */     if (this.g != null) {
/*  77 */       if (this.g.d()) {
/*  78 */         this.g.a();
/*  79 */       } else if (this.g.f() != null) {
/*  80 */         this.g.e().a(this.g.f());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected void a(char paramChar, int paramInt) {}
/*     */   
/*     */ 
/*     */   public void b()
/*     */   {
/*  92 */     this.n.clear();
/*  93 */     this.n.add(new bcb(0, this.l / 2 - 100, this.m / 2 + 50, brp.a("gui.cancel", new Object[0])));
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  98 */     if (parambcb.k == 0) {
/*  99 */       this.h = true;
/* 100 */       if (this.g != null) this.g.a(new fq("Aborted"));
/* 101 */       this.k.a(this.i);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 107 */     c();
/*     */     
/* 109 */     if (this.g == null) {
/* 110 */       a(this.q, brp.a("connect.connecting", new Object[0]), this.l / 2, this.m / 2 - 50, 16777215);
/*     */     } else {
/* 112 */       a(this.q, brp.a("connect.authorizing", new Object[0]), this.l / 2, this.m / 2 - 50, 16777215);
/*     */     }
/*     */     
/* 115 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */