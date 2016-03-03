/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ public class bjd
/*     */   implements apu
/*     */ {
/*  16 */   private static final Logger a = ;
/*     */   
/*     */   private apx b;
/*  19 */   private qd c = new qd();
/*  20 */   private List d = new ArrayList();
/*     */   private ahb e;
/*     */   
/*     */   public bjd(ahb paramahb) {
/*  24 */     this.b = new apw(paramahb, 0, 0);
/*     */     
/*  26 */     this.e = paramahb;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2)
/*     */   {
/*  31 */     return true;
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2) {
/*  35 */     apx localapx = d(paramInt1, paramInt2);
/*  36 */     if (!localapx.g()) {
/*  37 */       localapx.d();
/*     */     }
/*     */     
/*  40 */     this.c.d(agu.a(paramInt1, paramInt2));
/*  41 */     this.d.remove(localapx);
/*     */   }
/*     */   
/*     */ 
/*     */   public apx c(int paramInt1, int paramInt2)
/*     */   {
/*  47 */     apx localapx = new apx(this.e, paramInt1, paramInt2);
/*  48 */     this.c.a(agu.a(paramInt1, paramInt2), localapx);
/*  49 */     this.d.add(localapx);
/*  50 */     localapx.d = true;
/*     */     
/*  52 */     return localapx;
/*     */   }
/*     */   
/*     */ 
/*     */   public apx d(int paramInt1, int paramInt2)
/*     */   {
/*  58 */     apx localapx = (apx)this.c.a(agu.a(paramInt1, paramInt2));
/*  59 */     if (localapx == null) {
/*  60 */       return this.b;
/*     */     }
/*     */     
/*  63 */     return localapx;
/*     */   }
/*     */   
/*     */   public boolean a(boolean paramBoolean, qk paramqk)
/*     */   {
/*  68 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public void c() {}
/*     */   
/*     */ 
/*     */   public boolean d()
/*     */   {
/*  77 */     long l = System.currentTimeMillis();
/*     */     
/*  79 */     for (apx localapx : this.d) {
/*  80 */       localapx.b(System.currentTimeMillis() - l > 5L);
/*     */     }
/*  82 */     if (System.currentTimeMillis() - l > 100L) {
/*  83 */       a.info("Warning: Clientside chunk ticking took {} ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
/*     */     }
/*  85 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e()
/*     */   {
/*  90 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(apu paramapu, int paramInt1, int paramInt2) {}
/*     */   
/*     */ 
/*     */   public String f()
/*     */   {
/* 100 */     return "MultiplayerChunkCache: " + this.c.a() + ", " + this.d.size();
/*     */   }
/*     */   
/*     */   public List a(sx paramsx, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 105 */     return null;
/*     */   }
/*     */   
/*     */   public agt a(ahb paramahb, String paramString, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 110 */     return null;
/*     */   }
/*     */   
/*     */   public int g()
/*     */   {
/* 115 */     return this.d.size();
/*     */   }
/*     */   
/*     */   public void e(int paramInt1, int paramInt2) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */