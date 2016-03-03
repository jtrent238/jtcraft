/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
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
/*     */ public class bk
/*     */   extends y
/*     */ {
/*     */   public String c()
/*     */   {
/*  24 */     return "scoreboard";
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  29 */     return 2;
/*     */   }
/*     */   
/*     */   public String c(ac paramac)
/*     */   {
/*  34 */     return "commands.scoreboard.usage";
/*     */   }
/*     */   
/*     */   public void b(ac paramac, String[] paramArrayOfString)
/*     */   {
/*  39 */     if (paramArrayOfString.length >= 1) {
/*  40 */       if (paramArrayOfString[0].equalsIgnoreCase("objectives")) {
/*  41 */         if (paramArrayOfString.length == 1)
/*  42 */           throw new ci("commands.scoreboard.objectives.usage", new Object[0]);
/*  43 */         if (paramArrayOfString[1].equalsIgnoreCase("list")) {
/*  44 */           d(paramac);
/*  45 */         } else if (paramArrayOfString[1].equalsIgnoreCase("add")) {
/*  46 */           if (paramArrayOfString.length >= 4) {
/*  47 */             c(paramac, paramArrayOfString, 2);
/*     */           } else {
/*  49 */             throw new ci("commands.scoreboard.objectives.add.usage", new Object[0]);
/*     */           }
/*  51 */         } else if (paramArrayOfString[1].equalsIgnoreCase("remove")) {
/*  52 */           if (paramArrayOfString.length == 3) {
/*  53 */             h(paramac, paramArrayOfString[2]);
/*     */           } else {
/*  55 */             throw new ci("commands.scoreboard.objectives.remove.usage", new Object[0]);
/*     */           }
/*  57 */         } else if (paramArrayOfString[1].equalsIgnoreCase("setdisplay")) {
/*  58 */           if ((paramArrayOfString.length == 3) || (paramArrayOfString.length == 4)) {
/*  59 */             k(paramac, paramArrayOfString, 2);
/*     */           } else {
/*  61 */             throw new ci("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
/*     */           }
/*     */         } else {
/*  64 */           throw new ci("commands.scoreboard.objectives.usage", new Object[0]);
/*     */         }
/*     */         
/*  67 */         return; }
/*  68 */       if (paramArrayOfString[0].equalsIgnoreCase("players")) {
/*  69 */         if (paramArrayOfString.length == 1)
/*  70 */           throw new ci("commands.scoreboard.players.usage", new Object[0]);
/*  71 */         if (paramArrayOfString[1].equalsIgnoreCase("list")) {
/*  72 */           if (paramArrayOfString.length <= 3) {
/*  73 */             l(paramac, paramArrayOfString, 2);
/*     */           } else {
/*  75 */             throw new ci("commands.scoreboard.players.list.usage", new Object[0]);
/*     */           }
/*  77 */         } else if (paramArrayOfString[1].equalsIgnoreCase("add")) {
/*  78 */           if (paramArrayOfString.length == 5) {
/*  79 */             m(paramac, paramArrayOfString, 2);
/*     */           } else {
/*  81 */             throw new ci("commands.scoreboard.players.add.usage", new Object[0]);
/*     */           }
/*  83 */         } else if (paramArrayOfString[1].equalsIgnoreCase("remove")) {
/*  84 */           if (paramArrayOfString.length == 5) {
/*  85 */             m(paramac, paramArrayOfString, 2);
/*     */           } else {
/*  87 */             throw new ci("commands.scoreboard.players.remove.usage", new Object[0]);
/*     */           }
/*  89 */         } else if (paramArrayOfString[1].equalsIgnoreCase("set")) {
/*  90 */           if (paramArrayOfString.length == 5) {
/*  91 */             m(paramac, paramArrayOfString, 2);
/*     */           } else {
/*  93 */             throw new ci("commands.scoreboard.players.set.usage", new Object[0]);
/*     */           }
/*  95 */         } else if (paramArrayOfString[1].equalsIgnoreCase("reset")) {
/*  96 */           if (paramArrayOfString.length == 3) {
/*  97 */             n(paramac, paramArrayOfString, 2);
/*     */           } else {
/*  99 */             throw new ci("commands.scoreboard.players.reset.usage", new Object[0]);
/*     */           }
/*     */         } else {
/* 102 */           throw new ci("commands.scoreboard.players.usage", new Object[0]);
/*     */         }
/*     */         
/* 105 */         return; }
/* 106 */       if (paramArrayOfString[0].equalsIgnoreCase("teams")) {
/* 107 */         if (paramArrayOfString.length == 1)
/* 108 */           throw new ci("commands.scoreboard.teams.usage", new Object[0]);
/* 109 */         if (paramArrayOfString[1].equalsIgnoreCase("list")) {
/* 110 */           if (paramArrayOfString.length <= 3) {
/* 111 */             g(paramac, paramArrayOfString, 2);
/*     */           } else {
/* 113 */             throw new ci("commands.scoreboard.teams.list.usage", new Object[0]);
/*     */           }
/* 115 */         } else if (paramArrayOfString[1].equalsIgnoreCase("add")) {
/* 116 */           if (paramArrayOfString.length >= 3) {
/* 117 */             d(paramac, paramArrayOfString, 2);
/*     */           } else {
/* 119 */             throw new ci("commands.scoreboard.teams.add.usage", new Object[0]);
/*     */           }
/* 121 */         } else if (paramArrayOfString[1].equalsIgnoreCase("remove")) {
/* 122 */           if (paramArrayOfString.length == 3) {
/* 123 */             f(paramac, paramArrayOfString, 2);
/*     */           } else {
/* 125 */             throw new ci("commands.scoreboard.teams.remove.usage", new Object[0]);
/*     */           }
/* 127 */         } else if (paramArrayOfString[1].equalsIgnoreCase("empty")) {
/* 128 */           if (paramArrayOfString.length == 3) {
/* 129 */             j(paramac, paramArrayOfString, 2);
/*     */           } else {
/* 131 */             throw new ci("commands.scoreboard.teams.empty.usage", new Object[0]);
/*     */           }
/* 133 */         } else if (paramArrayOfString[1].equalsIgnoreCase("join")) {
/* 134 */           if ((paramArrayOfString.length >= 4) || ((paramArrayOfString.length == 3) && ((paramac instanceof yz)))) {
/* 135 */             h(paramac, paramArrayOfString, 2);
/*     */           } else {
/* 137 */             throw new ci("commands.scoreboard.teams.join.usage", new Object[0]);
/*     */           }
/* 139 */         } else if (paramArrayOfString[1].equalsIgnoreCase("leave")) {
/* 140 */           if ((paramArrayOfString.length >= 3) || ((paramac instanceof yz))) {
/* 141 */             i(paramac, paramArrayOfString, 2);
/*     */           } else {
/* 143 */             throw new ci("commands.scoreboard.teams.leave.usage", new Object[0]);
/*     */           }
/* 145 */         } else if (paramArrayOfString[1].equalsIgnoreCase("option")) {
/* 146 */           if ((paramArrayOfString.length == 4) || (paramArrayOfString.length == 5)) {
/* 147 */             e(paramac, paramArrayOfString, 2);
/*     */           } else {
/* 149 */             throw new ci("commands.scoreboard.teams.option.usage", new Object[0]);
/*     */           }
/*     */         } else {
/* 152 */           throw new ci("commands.scoreboard.teams.usage", new Object[0]);
/*     */         }
/*     */         
/* 155 */         return;
/*     */       }
/*     */     }
/*     */     
/* 159 */     throw new ci("commands.scoreboard.usage", new Object[0]);
/*     */   }
/*     */   
/*     */   protected bac d() {
/* 163 */     return MinecraftServer.I().a(0).W();
/*     */   }
/*     */   
/*     */   protected azx a(String paramString, boolean paramBoolean) {
/* 167 */     bac localbac = d();
/* 168 */     azx localazx = localbac.b(paramString);
/*     */     
/* 170 */     if (localazx == null)
/* 171 */       throw new cd("commands.scoreboard.objectiveNotFound", new Object[] { paramString });
/* 172 */     if ((paramBoolean) && (localazx.c().b())) {
/* 173 */       throw new cd("commands.scoreboard.objectiveReadOnly", new Object[] { paramString });
/*     */     }
/*     */     
/* 176 */     return localazx;
/*     */   }
/*     */   
/*     */   protected azy a(String paramString) {
/* 180 */     bac localbac = d();
/* 181 */     azy localazy = localbac.e(paramString);
/*     */     
/* 183 */     if (localazy == null) {
/* 184 */       throw new cd("commands.scoreboard.teamNotFound", new Object[] { paramString });
/*     */     }
/*     */     
/* 187 */     return localazy;
/*     */   }
/*     */   
/*     */   protected void c(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 191 */     String str1 = paramArrayOfString[(paramInt++)];
/* 192 */     String str2 = paramArrayOfString[(paramInt++)];
/* 193 */     bac localbac = d();
/* 194 */     bah localbah = (bah)bah.a.get(str2);
/*     */     
/* 196 */     if (localbah == null) {
/* 197 */       throw new ci("commands.scoreboard.objectives.add.wrongType", new Object[] { str2 });
/*     */     }
/* 199 */     if (localbac.b(str1) != null) {
/* 200 */       throw new cd("commands.scoreboard.objectives.add.alreadyExists", new Object[] { str1 });
/*     */     }
/* 202 */     if (str1.length() > 16) {
/* 203 */       throw new cf("commands.scoreboard.objectives.add.tooLong", new Object[] { str1, Integer.valueOf(16) });
/*     */     }
/* 205 */     if (str1.length() == 0) {
/* 206 */       throw new ci("commands.scoreboard.objectives.add.usage", new Object[0]);
/*     */     }
/*     */     
/* 209 */     if (paramArrayOfString.length > paramInt) {
/* 210 */       String str3 = a(paramac, paramArrayOfString, paramInt).c();
/*     */       
/* 212 */       if (str3.length() > 32) {
/* 213 */         throw new cf("commands.scoreboard.objectives.add.displayTooLong", new Object[] { str3, Integer.valueOf(32) });
/*     */       }
/* 215 */       if (str3.length() > 0) {
/* 216 */         localbac.a(str1, localbah).a(str3);
/*     */       } else {
/* 218 */         localbac.a(str1, localbah);
/*     */       }
/*     */     } else {
/* 221 */       localbac.a(str1, localbah);
/*     */     }
/*     */     
/* 224 */     a(paramac, this, "commands.scoreboard.objectives.add.success", new Object[] { str1 });
/*     */   }
/*     */   
/*     */   protected void d(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 228 */     String str1 = paramArrayOfString[(paramInt++)];
/* 229 */     bac localbac = d();
/*     */     
/* 231 */     if (localbac.e(str1) != null) {
/* 232 */       throw new cd("commands.scoreboard.teams.add.alreadyExists", new Object[] { str1 });
/*     */     }
/* 234 */     if (str1.length() > 16) {
/* 235 */       throw new cf("commands.scoreboard.teams.add.tooLong", new Object[] { str1, Integer.valueOf(16) });
/*     */     }
/* 237 */     if (str1.length() == 0) {
/* 238 */       throw new ci("commands.scoreboard.teams.add.usage", new Object[0]);
/*     */     }
/*     */     
/* 241 */     if (paramArrayOfString.length > paramInt) {
/* 242 */       String str2 = a(paramac, paramArrayOfString, paramInt).c();
/*     */       
/* 244 */       if (str2.length() > 32) {
/* 245 */         throw new cf("commands.scoreboard.teams.add.displayTooLong", new Object[] { str2, Integer.valueOf(32) });
/*     */       }
/* 247 */       if (str2.length() > 0) {
/* 248 */         localbac.f(str1).a(str2);
/*     */       } else {
/* 250 */         localbac.f(str1);
/*     */       }
/*     */     } else {
/* 253 */       localbac.f(str1);
/*     */     }
/*     */     
/* 256 */     a(paramac, this, "commands.scoreboard.teams.add.success", new Object[] { str1 });
/*     */   }
/*     */   
/*     */   protected void e(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 260 */     azy localazy = a(paramArrayOfString[(paramInt++)]);
/* 261 */     if (localazy == null) return;
/* 262 */     String str1 = paramArrayOfString[(paramInt++)].toLowerCase();
/*     */     
/* 264 */     if ((!str1.equalsIgnoreCase("color")) && (!str1.equalsIgnoreCase("friendlyfire")) && (!str1.equalsIgnoreCase("seeFriendlyInvisibles"))) {
/* 265 */       throw new ci("commands.scoreboard.teams.option.usage", new Object[0]);
/*     */     }
/*     */     
/* 268 */     if (paramArrayOfString.length == 4) {
/* 269 */       if (str1.equalsIgnoreCase("color"))
/* 270 */         throw new ci("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(a.a(true, false)) });
/* 271 */       if ((str1.equalsIgnoreCase("friendlyfire")) || (str1.equalsIgnoreCase("seeFriendlyInvisibles"))) {
/* 272 */         throw new ci("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(Arrays.asList(new String[] { "true", "false" })) });
/*     */       }
/*     */       
/* 275 */       throw new ci("commands.scoreboard.teams.option.usage", new Object[0]);
/*     */     }
/*     */     
/* 278 */     String str2 = paramArrayOfString[(paramInt++)];
/*     */     
/* 280 */     if (str1.equalsIgnoreCase("color")) {
/* 281 */       a locala = a.b(str2);
/* 282 */       if ((locala == null) || (locala.b())) throw new ci("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(a.a(true, false)) });
/* 283 */       localazy.b(locala.toString());
/* 284 */       localazy.c(a.v.toString());
/* 285 */     } else if (str1.equalsIgnoreCase("friendlyfire")) {
/* 286 */       if ((!str2.equalsIgnoreCase("true")) && (!str2.equalsIgnoreCase("false"))) throw new ci("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(Arrays.asList(new String[] { "true", "false" })) });
/* 287 */       localazy.a(str2.equalsIgnoreCase("true"));
/* 288 */     } else if (str1.equalsIgnoreCase("seeFriendlyInvisibles")) {
/* 289 */       if ((!str2.equalsIgnoreCase("true")) && (!str2.equalsIgnoreCase("false"))) throw new ci("commands.scoreboard.teams.option.noValue", new Object[] { str1, a(Arrays.asList(new String[] { "true", "false" })) });
/* 290 */       localazy.b(str2.equalsIgnoreCase("true"));
/*     */     }
/*     */     
/* 293 */     a(paramac, this, "commands.scoreboard.teams.option.success", new Object[] { str1, localazy.b(), str2 });
/*     */   }
/*     */   
/*     */   protected void f(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 297 */     bac localbac = d();
/* 298 */     azy localazy = a(paramArrayOfString[(paramInt++)]);
/* 299 */     if (localazy == null) { return;
/*     */     }
/* 301 */     localbac.d(localazy);
/*     */     
/* 303 */     a(paramac, this, "commands.scoreboard.teams.remove.success", new Object[] { localazy.b() });
/*     */   }
/*     */   
/*     */   protected void g(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 307 */     bac localbac = d();
/*     */     Object localObject1;
/* 309 */     Object localObject2; Object localObject3; if (paramArrayOfString.length > paramInt) {
/* 310 */       localObject1 = a(paramArrayOfString[(paramInt++)]);
/* 311 */       if (localObject1 == null) { return;
/*     */       }
/* 313 */       localObject2 = ((azy)localObject1).d();
/*     */       
/* 315 */       if (((Collection)localObject2).size() > 0) {
/* 316 */         localObject3 = new fr("commands.scoreboard.teams.list.player.count", new Object[] { Integer.valueOf(((Collection)localObject2).size()), ((azy)localObject1).b() });
/* 317 */         ((fr)localObject3).b().a(a.c);
/* 318 */         paramac.a((fj)localObject3);
/* 319 */         paramac.a(new fq(a(((Collection)localObject2).toArray())));
/*     */       } else {
/* 321 */         throw new cd("commands.scoreboard.teams.list.player.empty", new Object[] { ((azy)localObject1).b() });
/*     */       }
/*     */     } else {
/* 324 */       localObject1 = localbac.g();
/*     */       
/* 326 */       if (((Collection)localObject1).size() > 0) {
/* 327 */         localObject2 = new fr("commands.scoreboard.teams.list.count", new Object[] { Integer.valueOf(((Collection)localObject1).size()) });
/* 328 */         ((fr)localObject2).b().a(a.c);
/* 329 */         paramac.a((fj)localObject2);
/*     */         
/* 331 */         for (localObject3 = ((Collection)localObject1).iterator(); ((Iterator)localObject3).hasNext();) { azy localazy = (azy)((Iterator)localObject3).next();
/* 332 */           paramac.a(new fr("commands.scoreboard.teams.list.entry", new Object[] { localazy.b(), localazy.c(), Integer.valueOf(localazy.d().size()) }));
/*     */         }
/*     */       } else {
/* 335 */         throw new cd("commands.scoreboard.teams.list.empty", new Object[0]);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void h(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 341 */     bac localbac = d();
/* 342 */     String str1 = paramArrayOfString[(paramInt++)];
/* 343 */     HashSet localHashSet1 = new HashSet();
/* 344 */     HashSet localHashSet2 = new HashSet();
/*     */     String str2;
/* 346 */     if (((paramac instanceof yz)) && (paramInt == paramArrayOfString.length)) {
/* 347 */       str2 = b(paramac).b_();
/*     */       
/* 349 */       if (localbac.a(str2, str1)) {
/* 350 */         localHashSet1.add(str2);
/*     */       } else {
/* 352 */         localHashSet2.add(str2);
/*     */       }
/*     */     } else {
/* 355 */       while (paramInt < paramArrayOfString.length) {
/* 356 */         str2 = e(paramac, paramArrayOfString[(paramInt++)]);
/*     */         
/* 358 */         if (localbac.a(str2, str1)) {
/* 359 */           localHashSet1.add(str2);
/*     */         } else {
/* 361 */           localHashSet2.add(str2);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 366 */     if (!localHashSet1.isEmpty()) a(paramac, this, "commands.scoreboard.teams.join.success", new Object[] { Integer.valueOf(localHashSet1.size()), str1, a(localHashSet1.toArray(new String[0])) });
/* 367 */     if (!localHashSet2.isEmpty()) throw new cd("commands.scoreboard.teams.join.failure", new Object[] { Integer.valueOf(localHashSet2.size()), str1, a(localHashSet2.toArray(new String[0])) });
/*     */   }
/*     */   
/*     */   protected void i(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 371 */     bac localbac = d();
/* 372 */     HashSet localHashSet1 = new HashSet();
/* 373 */     HashSet localHashSet2 = new HashSet();
/*     */     String str;
/* 375 */     if (((paramac instanceof yz)) && (paramInt == paramArrayOfString.length)) {
/* 376 */       str = b(paramac).b_();
/*     */       
/* 378 */       if (localbac.g(str)) {
/* 379 */         localHashSet1.add(str);
/*     */       } else {
/* 381 */         localHashSet2.add(str);
/*     */       }
/*     */     } else {
/* 384 */       while (paramInt < paramArrayOfString.length) {
/* 385 */         str = e(paramac, paramArrayOfString[(paramInt++)]);
/*     */         
/* 387 */         if (localbac.g(str)) {
/* 388 */           localHashSet1.add(str);
/*     */         } else {
/* 390 */           localHashSet2.add(str);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 395 */     if (!localHashSet1.isEmpty()) a(paramac, this, "commands.scoreboard.teams.leave.success", new Object[] { Integer.valueOf(localHashSet1.size()), a(localHashSet1.toArray(new String[0])) });
/* 396 */     if (!localHashSet2.isEmpty()) throw new cd("commands.scoreboard.teams.leave.failure", new Object[] { Integer.valueOf(localHashSet2.size()), a(localHashSet2.toArray(new String[0])) });
/*     */   }
/*     */   
/*     */   protected void j(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 400 */     bac localbac = d();
/* 401 */     azy localazy = a(paramArrayOfString[(paramInt++)]);
/* 402 */     if (localazy == null) { return;
/*     */     }
/* 404 */     ArrayList localArrayList = new ArrayList(localazy.d());
/*     */     
/* 406 */     if (localArrayList.isEmpty()) {
/* 407 */       throw new cd("commands.scoreboard.teams.empty.alreadyEmpty", new Object[] { localazy.b() });
/*     */     }
/*     */     
/* 410 */     for (String str : localArrayList) {
/* 411 */       localbac.a(str, localazy);
/*     */     }
/*     */     
/* 414 */     a(paramac, this, "commands.scoreboard.teams.empty.success", new Object[] { Integer.valueOf(localArrayList.size()), localazy.b() });
/*     */   }
/*     */   
/*     */   protected void h(ac paramac, String paramString) {
/* 418 */     bac localbac = d();
/* 419 */     azx localazx = a(paramString, false);
/*     */     
/* 421 */     localbac.k(localazx);
/*     */     
/* 423 */     a(paramac, this, "commands.scoreboard.objectives.remove.success", new Object[] { paramString });
/*     */   }
/*     */   
/*     */   protected void d(ac paramac) {
/* 427 */     bac localbac = d();
/* 428 */     Collection localCollection = localbac.c();
/*     */     
/* 430 */     if (localCollection.size() > 0) {
/* 431 */       fr localfr = new fr("commands.scoreboard.objectives.list.count", new Object[] { Integer.valueOf(localCollection.size()) });
/* 432 */       localfr.b().a(a.c);
/* 433 */       paramac.a(localfr);
/*     */       
/* 435 */       for (azx localazx : localCollection) {
/* 436 */         paramac.a(new fr("commands.scoreboard.objectives.list.entry", new Object[] { localazx.b(), localazx.d(), localazx.c().a() }));
/*     */       }
/*     */     } else {
/* 439 */       throw new cd("commands.scoreboard.objectives.list.empty", new Object[0]);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void k(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 444 */     bac localbac = d();
/* 445 */     String str = paramArrayOfString[(paramInt++)];
/* 446 */     int i = bac.j(str);
/* 447 */     azx localazx = null;
/*     */     
/* 449 */     if (paramArrayOfString.length == 4) {
/* 450 */       localazx = a(paramArrayOfString[(paramInt++)], false);
/*     */     }
/*     */     
/* 453 */     if (i < 0) {
/* 454 */       throw new cd("commands.scoreboard.objectives.setdisplay.invalidSlot", new Object[] { str });
/*     */     }
/*     */     
/* 457 */     localbac.a(i, localazx);
/*     */     
/* 459 */     if (localazx != null) {
/* 460 */       a(paramac, this, "commands.scoreboard.objectives.setdisplay.successSet", new Object[] { bac.b(i), localazx.b() });
/*     */     } else {
/* 462 */       a(paramac, this, "commands.scoreboard.objectives.setdisplay.successCleared", new Object[] { bac.b(i) });
/*     */     }
/*     */   }
/*     */   
/*     */   protected void l(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 467 */     bac localbac = d();
/*     */     Object localObject1;
/* 469 */     Object localObject2; if (paramArrayOfString.length > paramInt) {
/* 470 */       localObject1 = e(paramac, paramArrayOfString[(paramInt++)]);
/* 471 */       localObject2 = localbac.d((String)localObject1);
/*     */       
/* 473 */       if (((Map)localObject2).size() > 0) {
/* 474 */         fr localfr = new fr("commands.scoreboard.players.list.player.count", new Object[] { Integer.valueOf(((Map)localObject2).size()), localObject1 });
/* 475 */         localfr.b().a(a.c);
/* 476 */         paramac.a(localfr);
/*     */         
/* 478 */         for (azz localazz : ((Map)localObject2).values()) {
/* 479 */           paramac.a(new fr("commands.scoreboard.players.list.player.entry", new Object[] { Integer.valueOf(localazz.c()), localazz.d().d(), localazz.d().b() }));
/*     */         }
/*     */       } else {
/* 482 */         throw new cd("commands.scoreboard.players.list.player.empty", new Object[] { localObject1 });
/*     */       }
/*     */     } else {
/* 485 */       localObject1 = localbac.d();
/*     */       
/* 487 */       if (((Collection)localObject1).size() > 0) {
/* 488 */         localObject2 = new fr("commands.scoreboard.players.list.count", new Object[] { Integer.valueOf(((Collection)localObject1).size()) });
/* 489 */         ((fr)localObject2).b().a(a.c);
/* 490 */         paramac.a((fj)localObject2);
/* 491 */         paramac.a(new fq(a(((Collection)localObject1).toArray())));
/*     */       } else {
/* 493 */         throw new cd("commands.scoreboard.players.list.empty", new Object[0]);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void m(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 499 */     String str1 = paramArrayOfString[(paramInt - 1)];
/* 500 */     String str2 = e(paramac, paramArrayOfString[(paramInt++)]);
/* 501 */     azx localazx = a(paramArrayOfString[(paramInt++)], true);
/* 502 */     int i = str1.equalsIgnoreCase("set") ? a(paramac, paramArrayOfString[(paramInt++)]) : a(paramac, paramArrayOfString[(paramInt++)], 1);
/* 503 */     bac localbac = d();
/* 504 */     azz localazz = localbac.a(str2, localazx);
/*     */     
/* 506 */     if (str1.equalsIgnoreCase("set")) {
/* 507 */       localazz.c(i);
/* 508 */     } else if (str1.equalsIgnoreCase("add")) {
/* 509 */       localazz.a(i);
/*     */     } else {
/* 511 */       localazz.b(i);
/*     */     }
/*     */     
/* 514 */     a(paramac, this, "commands.scoreboard.players.set.success", new Object[] { localazx.b(), str2, Integer.valueOf(localazz.c()) });
/*     */   }
/*     */   
/*     */   protected void n(ac paramac, String[] paramArrayOfString, int paramInt) {
/* 518 */     bac localbac = d();
/* 519 */     String str = e(paramac, paramArrayOfString[(paramInt++)]);
/*     */     
/* 521 */     localbac.c(str);
/*     */     
/* 523 */     a(paramac, this, "commands.scoreboard.players.reset.success", new Object[] { str });
/*     */   }
/*     */   
/*     */   public List a(ac paramac, String[] paramArrayOfString)
/*     */   {
/* 528 */     if (paramArrayOfString.length == 1) {
/* 529 */       return a(paramArrayOfString, new String[] { "objectives", "players", "teams" });
/*     */     }
/*     */     
/* 532 */     if (paramArrayOfString[0].equalsIgnoreCase("objectives")) {
/* 533 */       if (paramArrayOfString.length == 2) {
/* 534 */         return a(paramArrayOfString, new String[] { "list", "add", "remove", "setdisplay" });
/*     */       }
/*     */       
/* 537 */       if (paramArrayOfString[1].equalsIgnoreCase("add")) {
/* 538 */         if (paramArrayOfString.length == 4) {
/* 539 */           Set localSet = bah.a.keySet();
/* 540 */           return a(paramArrayOfString, localSet);
/*     */         }
/* 542 */       } else if (paramArrayOfString[1].equalsIgnoreCase("remove")) {
/* 543 */         if (paramArrayOfString.length == 3) {
/* 544 */           return a(paramArrayOfString, a(false));
/*     */         }
/* 546 */       } else if (paramArrayOfString[1].equalsIgnoreCase("setdisplay")) {
/* 547 */         if (paramArrayOfString.length == 3)
/* 548 */           return a(paramArrayOfString, new String[] { "list", "sidebar", "belowName" });
/* 549 */         if (paramArrayOfString.length == 4) {
/* 550 */           return a(paramArrayOfString, a(false));
/*     */         }
/*     */       }
/* 553 */     } else if (paramArrayOfString[0].equalsIgnoreCase("players")) {
/* 554 */       if (paramArrayOfString.length == 2) {
/* 555 */         return a(paramArrayOfString, new String[] { "set", "add", "remove", "reset", "list" });
/*     */       }
/*     */       
/* 558 */       if ((paramArrayOfString[1].equalsIgnoreCase("set")) || (paramArrayOfString[1].equalsIgnoreCase("add")) || (paramArrayOfString[1].equalsIgnoreCase("remove"))) {
/* 559 */         if (paramArrayOfString.length == 3)
/* 560 */           return a(paramArrayOfString, MinecraftServer.I().E());
/* 561 */         if (paramArrayOfString.length == 4) {
/* 562 */           return a(paramArrayOfString, a(true));
/*     */         }
/* 564 */       } else if (((paramArrayOfString[1].equalsIgnoreCase("reset")) || (paramArrayOfString[1].equalsIgnoreCase("list"))) && 
/* 565 */         (paramArrayOfString.length == 3)) {
/* 566 */         return a(paramArrayOfString, d().d());
/*     */       }
/*     */     }
/* 569 */     else if (paramArrayOfString[0].equalsIgnoreCase("teams")) {
/* 570 */       if (paramArrayOfString.length == 2) {
/* 571 */         return a(paramArrayOfString, new String[] { "add", "remove", "join", "leave", "empty", "list", "option" });
/*     */       }
/*     */       
/* 574 */       if (paramArrayOfString[1].equalsIgnoreCase("join")) {
/* 575 */         if (paramArrayOfString.length == 3)
/* 576 */           return a(paramArrayOfString, d().f());
/* 577 */         if (paramArrayOfString.length >= 4)
/* 578 */           return a(paramArrayOfString, MinecraftServer.I().E());
/*     */       } else {
/* 580 */         if (paramArrayOfString[1].equalsIgnoreCase("leave"))
/* 581 */           return a(paramArrayOfString, MinecraftServer.I().E());
/* 582 */         if ((paramArrayOfString[1].equalsIgnoreCase("empty")) || (paramArrayOfString[1].equalsIgnoreCase("list")) || (paramArrayOfString[1].equalsIgnoreCase("remove"))) {
/* 583 */           if (paramArrayOfString.length == 3) {
/* 584 */             return a(paramArrayOfString, d().f());
/*     */           }
/* 586 */         } else if (paramArrayOfString[1].equalsIgnoreCase("option")) {
/* 587 */           if (paramArrayOfString.length == 3)
/* 588 */             return a(paramArrayOfString, d().f());
/* 589 */           if (paramArrayOfString.length == 4)
/* 590 */             return a(paramArrayOfString, new String[] { "color", "friendlyfire", "seeFriendlyInvisibles" });
/* 591 */           if (paramArrayOfString.length == 5) {
/* 592 */             if (paramArrayOfString[3].equalsIgnoreCase("color"))
/* 593 */               return a(paramArrayOfString, a.a(true, false));
/* 594 */             if ((paramArrayOfString[3].equalsIgnoreCase("friendlyfire")) || (paramArrayOfString[3].equalsIgnoreCase("seeFriendlyInvisibles"))) {
/* 595 */               return a(paramArrayOfString, new String[] { "true", "false" });
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 601 */     return null;
/*     */   }
/*     */   
/*     */   protected List a(boolean paramBoolean) {
/* 605 */     Collection localCollection = d().c();
/* 606 */     ArrayList localArrayList = new ArrayList();
/*     */     azx localazx;
/* 608 */     for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); 
/* 609 */         localArrayList.add(localazx.b()))
/*     */     {
/* 608 */       localazx = (azx)localIterator.next();
/* 609 */       if ((paramBoolean) && (localazx.c().b())) {}
/*     */     }
/*     */     
/* 612 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public boolean a(String[] paramArrayOfString, int paramInt)
/*     */   {
/* 617 */     if (paramArrayOfString[0].equalsIgnoreCase("players"))
/* 618 */       return paramInt == 2;
/* 619 */     if (paramArrayOfString[0].equalsIgnoreCase("teams")) {
/* 620 */       return (paramInt == 2) || (paramInt == 3);
/*     */     }
/*     */     
/* 623 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */