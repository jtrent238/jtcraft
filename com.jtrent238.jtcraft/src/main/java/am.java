/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class am
/*     */   extends y
/*     */ {
/*     */   public String c()
/*     */   {
/*  20 */     return "effect";
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  25 */     return 2;
/*     */   }
/*     */   
/*     */   public String c(ac paramac)
/*     */   {
/*  30 */     return "commands.effect.usage";
/*     */   }
/*     */   
/*     */   public void b(ac paramac, String[] paramArrayOfString)
/*     */   {
/*  35 */     if (paramArrayOfString.length >= 2) {
/*  36 */       mw localmw = d(paramac, paramArrayOfString[0]);
/*     */       
/*  38 */       if (paramArrayOfString[1].equals("clear")) {
/*  39 */         if (localmw.aQ().isEmpty()) {
/*  40 */           throw new cd("commands.effect.failure.notActive.all", new Object[] { localmw.b_() });
/*     */         }
/*  42 */         localmw.aP();
/*  43 */         a(paramac, this, "commands.effect.success.removed.all", new Object[] { localmw.b_() });
/*     */       }
/*     */       else {
/*  46 */         int i = a(paramac, paramArrayOfString[1], 1);
/*  47 */         int j = 600;
/*  48 */         int k = 30;
/*  49 */         int m = 0;
/*     */         
/*  51 */         if ((i < 0) || (i >= rv.a.length) || (rv.a[i] == null)) {
/*  52 */           throw new ce("commands.effect.notFound", new Object[] { Integer.valueOf(i) });
/*     */         }
/*     */         
/*  55 */         if (paramArrayOfString.length >= 3) {
/*  56 */           k = a(paramac, paramArrayOfString[2], 0, 1000000);
/*  57 */           if (rv.a[i].b()) {
/*  58 */             j = k;
/*     */           } else {
/*  60 */             j = k * 20;
/*     */           }
/*  62 */         } else if (rv.a[i].b()) {
/*  63 */           j = 1;
/*     */         }
/*     */         
/*  66 */         if (paramArrayOfString.length >= 4) {
/*  67 */           m = a(paramac, paramArrayOfString[3], 0, 255);
/*     */         }
/*     */         
/*  70 */         if (k == 0) {
/*  71 */           if (localmw.k(i)) {
/*  72 */             localmw.m(i);
/*  73 */             a(paramac, this, "commands.effect.success.removed", new Object[] { new fr(rv.a[i].a(), new Object[0]), localmw.b_() });
/*     */           } else {
/*  75 */             throw new cd("commands.effect.failure.notActive", new Object[] { new fr(rv.a[i].a(), new Object[0]), localmw.b_() });
/*     */           }
/*     */         } else {
/*  78 */           rw localrw = new rw(i, j, m);
/*  79 */           localmw.c(localrw);
/*  80 */           a(paramac, this, "commands.effect.success", new Object[] { new fr(localrw.f(), new Object[0]), Integer.valueOf(i), Integer.valueOf(m), localmw.b_(), Integer.valueOf(k) });
/*     */         }
/*     */       }
/*     */       
/*  84 */       return;
/*     */     }
/*     */     
/*  87 */     throw new ci("commands.effect.usage", new Object[0]);
/*     */   }
/*     */   
/*     */   public List a(ac paramac, String[] paramArrayOfString)
/*     */   {
/*  92 */     if (paramArrayOfString.length == 1) {
/*  93 */       return a(paramArrayOfString, d());
/*     */     }
/*     */     
/*  96 */     return null;
/*     */   }
/*     */   
/*     */   protected String[] d() {
/* 100 */     return MinecraftServer.I().E();
/*     */   }
/*     */   
/*     */   public boolean a(String[] paramArrayOfString, int paramInt)
/*     */   {
/* 105 */     return paramInt == 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */