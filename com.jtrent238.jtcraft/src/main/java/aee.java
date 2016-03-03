/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class aee
/*     */   extends adb
/*     */ {
/*     */   private rf a;
/*     */   
/*     */   public aee()
/*     */   {
/*  25 */     a(true);
/*  26 */     a(abt.f);
/*     */   }
/*     */   
/*     */ 
/*     */   public String n(add paramadd)
/*     */   {
/*  32 */     String str1 = ("" + dd.a(new StringBuilder().append(a()).append(".name").toString())).trim();
/*     */     
/*  34 */     String str2 = sg.b(paramadd.k());
/*  35 */     if (str2 != null) {
/*  36 */       str1 = str1 + " " + dd.a(new StringBuilder().append("entity.").append(str2).append(".name").toString());
/*     */     }
/*     */     
/*  39 */     return str1;
/*     */   }
/*     */   
/*     */   public int a(add paramadd, int paramInt)
/*     */   {
/*  44 */     sh localsh = (sh)sg.a.get(Integer.valueOf(paramadd.k()));
/*  45 */     if (localsh != null) {
/*  46 */       if (paramInt == 0) {
/*  47 */         return localsh.b;
/*     */       }
/*  49 */       return localsh.c;
/*     */     }
/*  51 */     return 16777215;
/*     */   }
/*     */   
/*     */   public boolean b()
/*     */   {
/*  56 */     return true;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  61 */     if (paramInt2 > 0) {
/*  62 */       return this.a;
/*     */     }
/*  64 */     return super.a(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  69 */     if (paramahb.E) {
/*  70 */       return true;
/*     */     }
/*     */     
/*  73 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*     */     
/*  75 */     paramInt1 += q.b[paramInt4];
/*  76 */     paramInt2 += q.c[paramInt4];
/*  77 */     paramInt3 += q.d[paramInt4];
/*     */     
/*  79 */     double d = 0.0D;
/*  80 */     if ((paramInt4 == 1) && (localaji.b() == 11))
/*     */     {
/*  82 */       d = 0.5D;
/*     */     }
/*     */     
/*  85 */     sa localsa = a(paramahb, paramadd.k(), paramInt1 + 0.5D, paramInt2 + d, paramInt3 + 0.5D);
/*  86 */     if (localsa != null) {
/*  87 */       if (((localsa instanceof sv)) && (paramadd.u())) {
/*  88 */         ((sw)localsa).a(paramadd.s());
/*     */       }
/*  90 */       if (!paramyz.bE.d) {
/*  91 */         paramadd.b -= 1;
/*     */       }
/*     */     }
/*     */     
/*  95 */     return true;
/*     */   }
/*     */   
/*     */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*     */   {
/* 100 */     if (paramahb.E) { return paramadd;
/*     */     }
/* 102 */     azu localazu = a(paramahb, paramyz, true);
/* 103 */     if (localazu == null) { return paramadd;
/*     */     }
/* 105 */     if (localazu.a == azv.b) {
/* 106 */       int i = localazu.b;
/* 107 */       int j = localazu.c;
/* 108 */       int k = localazu.d;
/*     */       
/* 110 */       if (!paramahb.a(paramyz, i, j, k)) {
/* 111 */         return paramadd;
/*     */       }
/* 113 */       if (!paramyz.a(i, j, k, localazu.e, paramadd)) { return paramadd;
/*     */       }
/* 115 */       if ((paramahb.a(i, j, k) instanceof alw)) {
/* 116 */         sa localsa = a(paramahb, paramadd.k(), i, j, k);
/* 117 */         if (localsa != null) {
/* 118 */           if (((localsa instanceof sv)) && (paramadd.u())) {
/* 119 */             ((sw)localsa).a(paramadd.s());
/*     */           }
/* 121 */           if (!paramyz.bE.d) {
/* 122 */             paramadd.b -= 1;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 127 */     return paramadd;
/*     */   }
/*     */   
/*     */   public static sa a(ahb paramahb, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 131 */     if (!sg.a.containsKey(Integer.valueOf(paramInt))) {
/* 132 */       return null;
/*     */     }
/*     */     
/* 135 */     sa localsa = null;
/*     */     
/* 137 */     for (int i = 0; i < 1; i++) {
/* 138 */       localsa = sg.a(paramInt, paramahb);
/*     */       
/* 140 */       if ((localsa != null) && ((localsa instanceof sv))) {
/* 141 */         sw localsw = (sw)localsa;
/* 142 */         localsa.b(paramDouble1, paramDouble2, paramDouble3, qh.g(paramahb.s.nextFloat() * 360.0F), 0.0F);
/* 143 */         localsw.aO = localsw.y;
/* 144 */         localsw.aM = localsw.y;
/*     */         
/* 146 */         localsw.a(null);
/* 147 */         paramahb.d(localsa);
/* 148 */         localsw.r();
/*     */       }
/*     */     }
/*     */     
/* 152 */     return localsa;
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/* 157 */     for (sh localsh : sg.a.values()) {
/* 158 */       paramList.add(new add(paramadb, 1, localsh.a));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 164 */     super.a(paramrg);
/* 165 */     this.a = paramrg.a(w() + "_overlay");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */