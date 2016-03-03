/*     */ import java.util.ArrayList;
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
/*     */ public class ago
/*     */   extends ArrayList
/*     */ {
/*     */   public ago() {}
/*     */   
/*     */   public ago(dh paramdh)
/*     */   {
/*  20 */     a(paramdh);
/*     */   }
/*     */   
/*     */   public agn a(add paramadd1, add paramadd2, int paramInt) {
/*  24 */     if ((paramInt > 0) && (paramInt < size()))
/*     */     {
/*  26 */       agn localagn1 = (agn)get(paramInt);
/*  27 */       if ((paramadd1.b() == localagn1.a().b()) && (((paramadd2 == null) && (!localagn1.c())) || ((localagn1.c()) && (paramadd2 != null) && (localagn1.b().b() == paramadd2.b()) && 
/*  28 */         (paramadd1.b >= localagn1.a().b) && ((!localagn1.c()) || (paramadd2.b >= localagn1.b().b))))) {
/*  29 */         return localagn1;
/*     */       }
/*     */       
/*  32 */       return null;
/*     */     }
/*  34 */     for (int i = 0; i < size(); i++) {
/*  35 */       agn localagn2 = (agn)get(i);
/*  36 */       if ((paramadd1.b() == localagn2.a().b()) && (paramadd1.b >= localagn2.a().b) && (((!localagn2.c()) && (paramadd2 == null)) || ((localagn2.c()) && (paramadd2 != null) && (localagn2.b().b() == paramadd2.b()) && (paramadd2.b >= localagn2.b().b))))
/*     */       {
/*  38 */         return localagn2;
/*     */       }
/*     */     }
/*  41 */     return null;
/*     */   }
/*     */   
/*     */   public void a(agn paramagn) {
/*  45 */     for (int i = 0; i < size(); i++) {
/*  46 */       agn localagn = (agn)get(i);
/*  47 */       if (paramagn.a(localagn)) {
/*  48 */         if (paramagn.b(localagn)) {
/*  49 */           set(i, paramagn);
/*     */         }
/*  51 */         return;
/*     */       }
/*     */     }
/*  54 */     add(paramagn);
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
/*     */   public void a(et paramet)
/*     */   {
/*  70 */     paramet.writeByte((byte)(size() & 0xFF));
/*  71 */     for (int i = 0; i < size(); i++) {
/*  72 */       agn localagn = (agn)get(i);
/*  73 */       paramet.a(localagn.a());
/*  74 */       paramet.a(localagn.d());
/*     */       
/*  76 */       add localadd = localagn.b();
/*  77 */       paramet.writeBoolean(localadd != null);
/*  78 */       if (localadd != null) {
/*  79 */         paramet.a(localadd);
/*     */       }
/*  81 */       paramet.writeBoolean(localagn.g());
/*     */     }
/*     */   }
/*     */   
/*     */   public static ago b(et paramet) {
/*  86 */     ago localago = new ago();
/*     */     
/*  88 */     int i = paramet.readByte() & 0xFF;
/*  89 */     for (int j = 0; j < i; j++) {
/*  90 */       add localadd1 = paramet.c();
/*  91 */       add localadd2 = paramet.c();
/*     */       
/*  93 */       add localadd3 = null;
/*  94 */       if (paramet.readBoolean()) {
/*  95 */         localadd3 = paramet.c();
/*     */       }
/*  97 */       boolean bool = paramet.readBoolean();
/*     */       
/*  99 */       agn localagn = new agn(localadd1, localadd3, localadd2);
/* 100 */       if (bool) {
/* 101 */         localagn.h();
/*     */       }
/* 103 */       localago.add(localagn);
/*     */     }
/* 105 */     return localago;
/*     */   }
/*     */   
/*     */   public void a(dh paramdh) {
/* 109 */     dq localdq = paramdh.c("Recipes", 10);
/*     */     
/* 111 */     for (int i = 0; i < localdq.c(); i++) {
/* 112 */       dh localdh = localdq.b(i);
/* 113 */       add(new agn(localdh));
/*     */     }
/*     */   }
/*     */   
/*     */   public dh a() {
/* 118 */     dh localdh = new dh();
/*     */     
/* 120 */     dq localdq = new dq();
/* 121 */     for (int i = 0; i < size(); i++) {
/* 122 */       agn localagn = (agn)get(i);
/* 123 */       localdq.a(localagn.i());
/*     */     }
/* 125 */     localdh.a("Recipes", localdq);
/* 126 */     return localdh;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ago.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */