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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bx
/*     */   extends y
/*     */ {
/*     */   public String c()
/*     */   {
/*  24 */     return "testforblock";
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  29 */     return 2;
/*     */   }
/*     */   
/*     */   public String c(ac paramac)
/*     */   {
/*  34 */     return "commands.testforblock.usage";
/*     */   }
/*     */   
/*     */   public void b(ac paramac, String[] paramArrayOfString)
/*     */   {
/*  39 */     if (paramArrayOfString.length >= 4) {
/*  40 */       int i = paramac.f_().a;
/*  41 */       int j = paramac.f_().b;
/*  42 */       int k = paramac.f_().c;
/*  43 */       i = qh.c(a(paramac, i, paramArrayOfString[0]));
/*  44 */       j = qh.c(a(paramac, j, paramArrayOfString[1]));
/*  45 */       k = qh.c(a(paramac, k, paramArrayOfString[2]));
/*     */       
/*  47 */       aji localaji = aji.b(paramArrayOfString[3]);
/*  48 */       if (localaji == null) {
/*  49 */         throw new ce("commands.setblock.notFound", new Object[] { paramArrayOfString[3] });
/*     */       }
/*     */       
/*  52 */       int m = -1;
/*  53 */       if (paramArrayOfString.length >= 5) {
/*  54 */         m = a(paramac, paramArrayOfString[4], -1, 15);
/*     */       }
/*     */       
/*  57 */       ahb localahb = paramac.d();
/*  58 */       if (!localahb.d(i, j, k)) {
/*  59 */         throw new cd("commands.testforblock.outOfWorld", new Object[0]);
/*     */       }
/*     */       
/*  62 */       dh localdh1 = new dh();
/*  63 */       int n = 0;
/*  64 */       if ((paramArrayOfString.length >= 6) && (localaji.u())) {
/*  65 */         localObject = a(paramac, paramArrayOfString, 5).c();
/*     */         try {
/*  67 */           dy localdy = eb.a((String)localObject);
/*  68 */           if ((localdy instanceof dh)) {
/*  69 */             localdh1 = (dh)localdy;
/*  70 */             n = 1;
/*     */           } else {
/*  72 */             throw new cd("commands.setblock.tagError", new Object[] { "Not a valid tag" });
/*     */           }
/*     */         } catch (ea localea) {
/*  75 */           throw new cd("commands.setblock.tagError", new Object[] { localea.getMessage() });
/*     */         }
/*     */       }
/*     */       
/*  79 */       Object localObject = localahb.a(i, j, k);
/*  80 */       if (localObject != localaji) {
/*  81 */         throw new cd("commands.testforblock.failed.tile", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), ((aji)localObject).F(), localaji.F() });
/*     */       }
/*     */       
/*  84 */       if (m > -1) {
/*  85 */         int i1 = localahb.e(i, j, k);
/*  86 */         if (i1 != m) {
/*  87 */           throw new cd("commands.testforblock.failed.data", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i1), Integer.valueOf(m) });
/*     */         }
/*     */       }
/*     */       
/*  91 */       if (n != 0) {
/*  92 */         aor localaor = localahb.o(i, j, k);
/*  93 */         if (localaor == null) {
/*  94 */           throw new cd("commands.testforblock.failed.tileEntity", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
/*     */         }
/*  96 */         dh localdh2 = new dh();
/*  97 */         localaor.b(localdh2);
/*     */         
/*  99 */         if (!a(localdh1, localdh2)) {
/* 100 */           throw new cd("commands.testforblock.failed.nbt", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
/*     */         }
/*     */       }
/*     */       
/* 104 */       paramac.a(new fr("commands.testforblock.success", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) }));
/*     */       
/* 106 */       return;
/*     */     }
/*     */     
/* 109 */     throw new ci("commands.testforblock.usage", new Object[0]);
/*     */   }
/*     */   
/*     */   public boolean a(dy paramdy1, dy paramdy2)
/*     */   {
/* 114 */     if (paramdy1 == paramdy2) return true;
/* 115 */     if (paramdy1 == null) return true;
/* 116 */     if (paramdy2 == null) return false;
/* 117 */     if (!paramdy1.getClass().equals(paramdy2.getClass())) { return false;
/*     */     }
/* 119 */     if ((paramdy1 instanceof dh)) {
/* 120 */       dh localdh1 = (dh)paramdy1;
/* 121 */       dh localdh2 = (dh)paramdy2;
/*     */       
/* 123 */       for (String str : localdh1.c()) {
/* 124 */         dy localdy = localdh1.a(str);
/* 125 */         if (!a(localdy, localdh2.a(str))) { return false;
/*     */         }
/*     */       }
/* 128 */       return true;
/*     */     }
/* 130 */     return paramdy1.equals(paramdy2);
/*     */   }
/*     */   
/*     */ 
/*     */   public List a(ac paramac, String[] paramArrayOfString)
/*     */   {
/* 136 */     if (paramArrayOfString.length == 4) {
/* 137 */       return a(paramArrayOfString, aji.c.b());
/*     */     }
/*     */     
/* 140 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */