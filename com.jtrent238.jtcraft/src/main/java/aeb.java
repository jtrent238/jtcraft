/*     */ import com.mojang.authlib.GameProfile;
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
/*     */ public class aeb
/*     */   extends adb
/*     */ {
/*  23 */   private static final String[] b = { "skeleton", "wither", "zombie", "char", "creeper" };
/*     */   
/*     */ 
/*     */ 
/*  27 */   public static final String[] a = { "skeleton", "wither", "zombie", "steve", "creeper" };
/*     */   
/*     */   private rf[] c;
/*     */   
/*     */ 
/*     */   public aeb()
/*     */   {
/*  34 */     a(abt.c);
/*  35 */     f(0);
/*  36 */     a(true);
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  41 */     if (paramInt4 == 0) return false;
/*  42 */     if (!paramahb.a(paramInt1, paramInt2, paramInt3).o().a()) { return false;
/*     */     }
/*  44 */     if (paramInt4 == 1) { paramInt2++;
/*     */     }
/*  46 */     if (paramInt4 == 2) paramInt3--;
/*  47 */     if (paramInt4 == 3) paramInt3++;
/*  48 */     if (paramInt4 == 4) paramInt1--;
/*  49 */     if (paramInt4 == 5) { paramInt1++;
/*     */     }
/*  51 */     if (!paramahb.E) {
/*  52 */       paramahb.d(paramInt1, paramInt2, paramInt3, ajn.bP, paramInt4, 2);
/*     */       
/*  54 */       int i = 0;
/*  55 */       if (paramInt4 == 1) {
/*  56 */         i = qh.c(paramyz.y * 16.0F / 360.0F + 0.5D) & 0xF;
/*     */       }
/*     */       
/*  59 */       aor localaor = paramahb.o(paramInt1, paramInt2, paramInt3);
/*  60 */       if ((localaor != null) && ((localaor instanceof apn))) {
/*  61 */         if (paramadd.k() == 3) {
/*  62 */           GameProfile localGameProfile = null;
/*  63 */           if (paramadd.p()) {
/*  64 */             dh localdh = paramadd.q();
/*     */             
/*  66 */             if (localdh.b("SkullOwner", 10)) {
/*  67 */               localGameProfile = dv.a(localdh.m("SkullOwner"));
/*  68 */             } else if ((localdh.b("SkullOwner", 8)) && (localdh.j("SkullOwner").length() > 0)) {
/*  69 */               localGameProfile = new GameProfile(null, localdh.j("SkullOwner"));
/*     */             }
/*     */           }
/*     */           
/*  73 */           ((apn)localaor).a(localGameProfile);
/*     */         } else {
/*  75 */           ((apn)localaor).a(paramadd.k());
/*     */         }
/*  77 */         ((apn)localaor).b(i);
/*  78 */         ((anl)ajn.bP).a(paramahb, paramInt1, paramInt2, paramInt3, (apn)localaor);
/*     */       }
/*     */       
/*  81 */       paramadd.b -= 1;
/*     */     }
/*     */     
/*  84 */     return true;
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
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/* 105 */     for (int i = 0; i < b.length; i++) {
/* 106 */       paramList.add(new add(paramadb, 1, i));
/*     */     }
/*     */   }
/*     */   
/*     */   public rf b_(int paramInt)
/*     */   {
/* 112 */     if ((paramInt < 0) || (paramInt >= b.length)) {
/* 113 */       paramInt = 0;
/*     */     }
/* 115 */     return this.c[paramInt];
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/* 120 */     return paramInt;
/*     */   }
/*     */   
/*     */   public String a(add paramadd)
/*     */   {
/* 125 */     int i = paramadd.k();
/* 126 */     if ((i < 0) || (i >= b.length)) {
/* 127 */       i = 0;
/*     */     }
/* 129 */     return super.a() + "." + b[i];
/*     */   }
/*     */   
/*     */   public String n(add paramadd)
/*     */   {
/* 134 */     if ((paramadd.k() == 3) && (paramadd.p())) {
/* 135 */       if (paramadd.q().b("SkullOwner", 10))
/* 136 */         return dd.a("item.skull.player.name", new Object[] { dv.a(paramadd.q().m("SkullOwner")).getName() });
/* 137 */       if (paramadd.q().b("SkullOwner", 8)) {
/* 138 */         return dd.a("item.skull.player.name", new Object[] { paramadd.q().j("SkullOwner") });
/*     */       }
/*     */     }
/*     */     
/* 142 */     return super.n(paramadd);
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 147 */     this.c = new rf[a.length];
/*     */     
/* 149 */     for (int i = 0; i < a.length; i++) {
/* 150 */       this.c[i] = paramrg.a(w() + "_" + a[i]);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aeb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */