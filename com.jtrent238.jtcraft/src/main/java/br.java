/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class br
/*     */   extends y
/*     */ {
/*     */   public String c()
/*     */   {
/*  24 */     return "spreadplayers";
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  29 */     return 2;
/*     */   }
/*     */   
/*     */   public String c(ac paramac)
/*     */   {
/*  34 */     return "commands.spreadplayers.usage";
/*     */   }
/*     */   
/*     */   public void b(ac paramac, String[] paramArrayOfString)
/*     */   {
/*  39 */     if (paramArrayOfString.length < 6) throw new ci("commands.spreadplayers.usage", new Object[0]);
/*  40 */     int i = 0;
/*  41 */     double d1 = a(paramac, NaN.0D, paramArrayOfString[(i++)]);
/*  42 */     double d2 = a(paramac, NaN.0D, paramArrayOfString[(i++)]);
/*  43 */     double d3 = a(paramac, paramArrayOfString[(i++)], 0.0D);
/*  44 */     double d4 = a(paramac, paramArrayOfString[(i++)], d3 + 1.0D);
/*  45 */     boolean bool = c(paramac, paramArrayOfString[(i++)]);
/*     */     
/*  47 */     ArrayList localArrayList = Lists.newArrayList();
/*     */     
/*  49 */     while (i < paramArrayOfString.length) {
/*  50 */       String str = paramArrayOfString[(i++)];
/*     */       Object localObject;
/*  52 */       if (ad.b(str)) {
/*  53 */         localObject = ad.c(paramac, str);
/*     */         
/*  55 */         if ((localObject != null) && (localObject.length != 0)) {
/*  56 */           Collections.addAll(localArrayList, (Object[])localObject);
/*     */         } else {
/*  58 */           throw new cg();
/*     */         }
/*     */       } else {
/*  61 */         localObject = MinecraftServer.I().ah().a(str);
/*     */         
/*  63 */         if (localObject != null) {
/*  64 */           localArrayList.add(localObject);
/*     */         } else {
/*  66 */           throw new cg();
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  71 */     if (localArrayList.isEmpty()) {
/*  72 */       throw new cg();
/*     */     }
/*     */     
/*  75 */     paramac.a(new fr("commands.spreadplayers.spreading." + (bool ? "teams" : "players"), new Object[] { Integer.valueOf(localArrayList.size()), Double.valueOf(d4), Double.valueOf(d1), Double.valueOf(d2), Double.valueOf(d3) }));
/*     */     
/*  77 */     a(paramac, localArrayList, new bs(d1, d2), d3, d4, ((sv)localArrayList.get(0)).o, bool);
/*     */   }
/*     */   
/*     */   private void a(ac paramac, List paramList, bs parambs, double paramDouble1, double paramDouble2, ahb paramahb, boolean paramBoolean) {
/*  81 */     Random localRandom = new Random();
/*  82 */     double d1 = parambs.a - paramDouble2;
/*  83 */     double d2 = parambs.b - paramDouble2;
/*  84 */     double d3 = parambs.a + paramDouble2;
/*  85 */     double d4 = parambs.b + paramDouble2;
/*     */     
/*  87 */     bs[] arrayOfbs = a(localRandom, paramBoolean ? a(paramList) : paramList.size(), d1, d2, d3, d4);
/*  88 */     int i = a(parambs, paramDouble1, paramahb, localRandom, d1, d2, d3, d4, arrayOfbs, paramBoolean);
/*  89 */     double d5 = a(paramList, paramahb, arrayOfbs, paramBoolean);
/*     */     
/*  91 */     a(paramac, this, "commands.spreadplayers.success." + (paramBoolean ? "teams" : "players"), new Object[] { Integer.valueOf(arrayOfbs.length), Double.valueOf(parambs.a), Double.valueOf(parambs.b) });
/*  92 */     if (arrayOfbs.length > 1) paramac.a(new fr("commands.spreadplayers.info." + (paramBoolean ? "teams" : "players"), new Object[] { String.format("%.2f", new Object[] { Double.valueOf(d5) }), Integer.valueOf(i) }));
/*     */   }
/*     */   
/*     */   private int a(List paramList) {
/*  96 */     HashSet localHashSet = Sets.newHashSet();
/*     */     
/*  98 */     for (sv localsv : paramList) {
/*  99 */       if ((localsv instanceof yz)) {
/* 100 */         localHashSet.add(localsv.bt());
/*     */       } else {
/* 102 */         localHashSet.add(null);
/*     */       }
/*     */     }
/*     */     
/* 106 */     return localHashSet.size();
/*     */   }
/*     */   
/*     */   private int a(bs parambs, double paramDouble1, ahb paramahb, Random paramRandom, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, bs[] paramArrayOfbs, boolean paramBoolean) {
/* 110 */     int i = 1;
/*     */     
/* 112 */     double d1 = 3.4028234663852886E38D;
/*     */     
/* 114 */     for (int j = 0; (j < 10000) && (i != 0); j++) {
/* 115 */       i = 0;
/* 116 */       d1 = 3.4028234663852886E38D;
/*     */       int n;
/* 118 */       bs localbs2; for (int k = 0; k < paramArrayOfbs.length; k++) {
/* 119 */         bs localbs1 = paramArrayOfbs[k];
/* 120 */         n = 0;
/* 121 */         localbs2 = new bs();
/*     */         
/* 123 */         for (int i1 = 0; i1 < paramArrayOfbs.length; i1++) {
/* 124 */           if (k != i1) {
/* 125 */             bs localbs3 = paramArrayOfbs[i1];
/*     */             
/* 127 */             double d3 = localbs1.a(localbs3);
/* 128 */             d1 = Math.min(d3, d1);
/* 129 */             if (d3 < paramDouble1) {
/* 130 */               n++;
/* 131 */               localbs2.a += localbs3.a - localbs1.a;
/* 132 */               localbs2.b += localbs3.b - localbs1.b;
/*     */             }
/*     */           }
/*     */         }
/* 136 */         if (n > 0) {
/* 137 */           localbs2.a /= n;
/* 138 */           localbs2.b /= n;
/* 139 */           double d2 = localbs2.b();
/*     */           
/* 141 */           if (d2 > 0.0D) {
/* 142 */             localbs2.a();
/*     */             
/* 144 */             localbs1.b(localbs2);
/*     */           } else {
/* 146 */             localbs1.a(paramRandom, paramDouble2, paramDouble3, paramDouble4, paramDouble5);
/*     */           }
/*     */           
/* 149 */           i = 1;
/*     */         }
/*     */         
/* 152 */         if (localbs1.a(paramDouble2, paramDouble3, paramDouble4, paramDouble5)) {
/* 153 */           i = 1;
/*     */         }
/*     */       }
/*     */       
/* 157 */       if (i == 0) {
/* 158 */         for (localbs2 : paramArrayOfbs) {
/* 159 */           if (!localbs2.b(paramahb)) {
/* 160 */             localbs2.a(paramRandom, paramDouble2, paramDouble3, paramDouble4, paramDouble5);
/* 161 */             i = 1;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 167 */     if (j >= 10000) {
/* 168 */       throw new cd("commands.spreadplayers.failure." + (paramBoolean ? "teams" : "players"), new Object[] { Integer.valueOf(paramArrayOfbs.length), Double.valueOf(parambs.a), Double.valueOf(parambs.b), String.format("%.2f", new Object[] { Double.valueOf(d1) }) });
/*     */     }
/*     */     
/* 171 */     return j;
/*     */   }
/*     */   
/*     */   private double a(List paramList, ahb paramahb, bs[] paramArrayOfbs, boolean paramBoolean) {
/* 175 */     double d1 = 0.0D;
/* 176 */     int i = 0;
/* 177 */     HashMap localHashMap = Maps.newHashMap();
/*     */     
/* 179 */     for (int j = 0; j < paramList.size(); j++) {
/* 180 */       sv localsv = (sv)paramList.get(j);
/*     */       
/*     */       bs localbs;
/* 183 */       if (paramBoolean) {
/* 184 */         Object localObject = (localsv instanceof yz) ? localsv.bt() : null;
/*     */         
/* 186 */         if (!localHashMap.containsKey(localObject)) {
/* 187 */           localHashMap.put(localObject, paramArrayOfbs[(i++)]);
/*     */         }
/*     */         
/* 190 */         localbs = (bs)localHashMap.get(localObject);
/*     */       } else {
/* 192 */         localbs = paramArrayOfbs[(i++)];
/*     */       }
/*     */       
/* 195 */       localsv.a(qh.c(localbs.a) + 0.5F, localbs.a(paramahb), qh.c(localbs.b) + 0.5D);
/*     */       
/* 197 */       double d2 = Double.MAX_VALUE;
/* 198 */       for (int k = 0; k < paramArrayOfbs.length; k++)
/* 199 */         if (localbs != paramArrayOfbs[k])
/*     */         {
/* 201 */           double d3 = localbs.a(paramArrayOfbs[k]);
/* 202 */           d2 = Math.min(d3, d2);
/*     */         }
/* 204 */       d1 += d2;
/*     */     }
/*     */     
/* 207 */     d1 /= paramList.size();
/* 208 */     return d1;
/*     */   }
/*     */   
/*     */   private bs[] a(Random paramRandom, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 212 */     bs[] arrayOfbs = new bs[paramInt];
/*     */     
/* 214 */     for (int i = 0; i < arrayOfbs.length; i++) {
/* 215 */       bs localbs = new bs();
/*     */       
/* 217 */       localbs.a(paramRandom, paramDouble1, paramDouble2, paramDouble3, paramDouble4);
/*     */       
/* 219 */       arrayOfbs[i] = localbs;
/*     */     }
/*     */     
/* 222 */     return arrayOfbs;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */