/*     */ import java.util.List;
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
/*     */ public class bm
/*     */   extends y
/*     */ {
/*     */   public String c()
/*     */   {
/*  17 */     return "setblock";
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  22 */     return 2;
/*     */   }
/*     */   
/*     */   public String c(ac paramac)
/*     */   {
/*  27 */     return "commands.setblock.usage";
/*     */   }
/*     */   
/*     */   public void b(ac paramac, String[] paramArrayOfString)
/*     */   {
/*  32 */     if (paramArrayOfString.length >= 4)
/*     */     {
/*  34 */       int i = paramac.f_().a;
/*  35 */       int j = paramac.f_().b;
/*  36 */       int k = paramac.f_().c;
/*  37 */       i = qh.c(a(paramac, i, paramArrayOfString[0]));
/*  38 */       j = qh.c(a(paramac, j, paramArrayOfString[1]));
/*  39 */       k = qh.c(a(paramac, k, paramArrayOfString[2]));
/*     */       
/*  41 */       aji localaji = y.g(paramac, paramArrayOfString[3]);
/*     */       
/*  43 */       int m = 0;
/*  44 */       if (paramArrayOfString.length >= 5) {
/*  45 */         m = a(paramac, paramArrayOfString[4], 0, 15);
/*     */       }
/*     */       
/*  48 */       ahb localahb = paramac.d();
/*  49 */       if (!localahb.d(i, j, k)) {
/*  50 */         throw new cd("commands.setblock.outOfWorld", new Object[0]);
/*     */       }
/*     */       
/*  53 */       dh localdh = new dh();
/*  54 */       int n = 0;
/*  55 */       Object localObject; if ((paramArrayOfString.length >= 7) && (localaji.u())) {
/*  56 */         localObject = a(paramac, paramArrayOfString, 6).c();
/*     */         try {
/*  58 */           dy localdy = eb.a((String)localObject);
/*  59 */           if ((localdy instanceof dh)) {
/*  60 */             localdh = (dh)localdy;
/*  61 */             n = 1;
/*     */           } else {
/*  63 */             throw new cd("commands.setblock.tagError", new Object[] { "Not a valid tag" });
/*     */           }
/*     */         } catch (ea localea) {
/*  66 */           throw new cd("commands.setblock.tagError", new Object[] { localea.getMessage() });
/*     */         }
/*     */       }
/*     */       
/*  70 */       if (paramArrayOfString.length >= 6) {
/*  71 */         if (paramArrayOfString[5].equals("destroy")) {
/*  72 */           localahb.a(i, j, k, true);
/*  73 */         } else if ((paramArrayOfString[5].equals("keep")) && 
/*  74 */           (!localahb.c(i, j, k))) {
/*  75 */           throw new cd("commands.setblock.noChange", new Object[0]);
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*  80 */       if (!localahb.d(i, j, k, localaji, m, 3)) {
/*  81 */         throw new cd("commands.setblock.noChange", new Object[0]);
/*     */       }
/*     */       
/*  84 */       if (n != 0) {
/*  85 */         localObject = localahb.o(i, j, k);
/*  86 */         if (localObject != null)
/*     */         {
/*  88 */           localdh.a("x", i);
/*  89 */           localdh.a("y", j);
/*  90 */           localdh.a("z", k);
/*     */           
/*  92 */           ((aor)localObject).a(localdh);
/*     */         }
/*     */       }
/*  95 */       a(paramac, this, "commands.setblock.success", new Object[0]);
/*  96 */       return;
/*     */     }
/*     */     
/*  99 */     throw new ci("commands.setblock.usage", new Object[0]);
/*     */   }
/*     */   
/*     */   public List a(ac paramac, String[] paramArrayOfString)
/*     */   {
/* 104 */     if (paramArrayOfString.length == 4) {
/* 105 */       return a(paramArrayOfString, aji.c.b());
/*     */     }
/* 107 */     if (paramArrayOfString.length == 6) {
/* 108 */       return a(paramArrayOfString, new String[] { "replace", "destroy", "keep" });
/*     */     }
/*     */     
/* 111 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */