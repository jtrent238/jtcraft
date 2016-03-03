/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bu
/*     */   extends y
/*     */ {
/*     */   public String c()
/*     */   {
/*  15 */     return "summon";
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  20 */     return 2;
/*     */   }
/*     */   
/*     */   public String c(ac paramac)
/*     */   {
/*  25 */     return "commands.summon.usage";
/*     */   }
/*     */   
/*     */   public void b(ac paramac, String[] paramArrayOfString)
/*     */   {
/*  30 */     if (paramArrayOfString.length >= 1)
/*     */     {
/*  32 */       String str = paramArrayOfString[0];
/*  33 */       double d1 = paramac.f_().a + 0.5D;
/*  34 */       double d2 = paramac.f_().b;
/*  35 */       double d3 = paramac.f_().c + 0.5D;
/*     */       
/*  37 */       if (paramArrayOfString.length >= 4) {
/*  38 */         d1 = a(paramac, d1, paramArrayOfString[1]);
/*  39 */         d2 = a(paramac, d2, paramArrayOfString[2]);
/*  40 */         d3 = a(paramac, d3, paramArrayOfString[3]);
/*     */       }
/*     */       
/*  43 */       ahb localahb = paramac.d();
/*  44 */       if (!localahb.d((int)d1, (int)d2, (int)d3)) {
/*  45 */         a(paramac, this, "commands.summon.outOfWorld", new Object[0]);
/*  46 */         return;
/*     */       }
/*     */       
/*  49 */       dh localdh1 = new dh();
/*  50 */       int i = 0;
/*  51 */       if (paramArrayOfString.length >= 5) {
/*  52 */         localObject1 = a(paramac, paramArrayOfString, 4);
/*     */         try {
/*  54 */           dy localdy = eb.a(((fj)localObject1).c());
/*  55 */           if ((localdy instanceof dh)) {
/*  56 */             localdh1 = (dh)localdy;
/*  57 */             i = 1;
/*     */           } else {
/*  59 */             a(paramac, this, "commands.summon.tagError", new Object[] { "Not a valid tag" });
/*  60 */             return;
/*     */           }
/*     */         } catch (ea localea) {
/*  63 */           a(paramac, this, "commands.summon.tagError", new Object[] { localea.getMessage() });
/*  64 */           return;
/*     */         }
/*     */       }
/*  67 */       localdh1.a("id", str);
/*     */       
/*  69 */       Object localObject1 = sg.a(localdh1, localahb);
/*  70 */       if (localObject1 != null) {
/*  71 */         ((sa)localObject1).b(d1, d2, d3, ((sa)localObject1).y, ((sa)localObject1).z);
/*  72 */         if (i == 0)
/*     */         {
/*  74 */           if ((localObject1 instanceof sw)) {
/*  75 */             ((sw)localObject1).a(null);
/*     */           }
/*     */         }
/*  78 */         localahb.d((sa)localObject1);
/*     */         
/*     */ 
/*  81 */         Object localObject2 = localObject1;
/*  82 */         dh localdh2 = localdh1;
/*  83 */         while ((localObject2 != null) && (localdh2.b("Riding", 10))) {
/*  84 */           sa localsa = sg.a(localdh2.m("Riding"), localahb);
/*  85 */           if (localsa != null) {
/*  86 */             localsa.b(d1, d2, d3, localsa.y, localsa.z);
/*  87 */             localahb.d(localsa);
/*  88 */             ((sa)localObject2).a(localsa);
/*     */           }
/*  90 */           localObject2 = localsa;
/*  91 */           localdh2 = localdh2.m("Riding");
/*     */         }
/*  93 */         a(paramac, this, "commands.summon.success", new Object[0]);
/*  94 */         return;
/*     */       }
/*  96 */       a(paramac, this, "commands.summon.failed", new Object[0]);
/*  97 */       return;
/*     */     }
/*     */     
/*     */ 
/* 101 */     throw new ci("commands.summon.usage", new Object[0]);
/*     */   }
/*     */   
/*     */   public List a(ac paramac, String[] paramArrayOfString)
/*     */   {
/* 106 */     if (paramArrayOfString.length == 1) {
/* 107 */       return a(paramArrayOfString, d());
/*     */     }
/*     */     
/* 110 */     return null;
/*     */   }
/*     */   
/*     */   protected String[] d() {
/* 114 */     return (String[])sg.b().toArray(new String[0]);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */