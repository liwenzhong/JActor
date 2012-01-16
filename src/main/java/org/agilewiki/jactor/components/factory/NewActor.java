/*
 * Copyright 2011 Bill La Forge
 *
 * This file is part of AgileWiki and is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License (LGPL) as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 * or navigate to the following url http://www.gnu.org/licenses/lgpl-2.1.txt
 *
 * Note however that only Scala, Java and JavaScript files are being covered by LGPL.
 * All other files are covered by the Common Public License (CPL).
 * A copy of this license is also included and can be
 * found as well at http://www.opensource.org/licenses/cpl1.0.txt
 */
package org.agilewiki.jactor.components.factory;

import org.agilewiki.jactor.Actor;
import org.agilewiki.jactor.Mailbox;

/**
 * <p>NewActor is a request to create and configure an actor.</p>
 * <p>If no mailbox is specified, the mailbox of the actor processing the request is used.
 * And if no parent is specified, the actor processing the request is used.</p>
 * <p>If an actor name is given, it is assigned to the new actor
 * and the actor is added to the actor registry.
 * However, the actor must include the ActorName component.</p>
 */
public class NewActor {
    /**
     * An actor type name.
     */
    private String actorType;

    /**
     * A mailbox which may be shared with other actors.
     */
    private Mailbox mailbox;

    /**
     * The name to be assigned to the actor.
     */
    private String actorName;

    /**
     * The parent actor to which unrecognized requests are forwarded.
     */
    private Actor parent;

    /**
     * Create a NewActor request.
     *
     * @param actorType An actor type name.
     */
    public NewActor(String actorType) {
        this.actorType = actorType;
    }

    /**
     * Create a NewActor request.
     *
     * @param actorType An actor type name.
     * @param mailbox   A mailbox which may be shared with other actors, or null.
     */
    public NewActor(String actorType, Mailbox mailbox) {
        this.actorType = actorType;
        this.mailbox = mailbox;
    }

    /**
     * Create a NewActor request.
     *
     * @param actorType An actor type name.
     * @param mailbox   A mailbox which may be shared with other actors, or null.
     * @param actorName The name to be assigned to the actor, or null.
     */
    public NewActor(String actorType, Mailbox mailbox, String actorName) {
        this.actorType = actorType;
        this.mailbox = mailbox;
        this.actorName = actorName;
    }

    /**
     * Create a NewActor request.
     *
     * @param actorType An actor type name.
     * @param mailbox   A mailbox which may be shared with other actors, or null.
     * @param actorName The name to be assigned to the actor, or null.
     * @param parent    The parent actor to which unrecognized requests are forwarded, or null.
     */
    public NewActor(String actorType, Mailbox mailbox, String actorName, Actor parent) {
        this.actorType = actorType;
        this.mailbox = mailbox;
        this.actorName = actorName;
        this.parent = parent;
    }

    /**
     * Returns an actor type name.
     *
     * @return An actor type name.
     */
    public String getActorType() {
        return actorType;
    }

    /**
     * Returns a mailbox which may be shared with other actors.
     *
     * @return A mailbox which may be shared with other actors, or null.
     */
    public Mailbox getMailbox() {
        return mailbox;
    }

    /**
     * Returns the name to be assigned to the actor.
     *
     * @return The name to be assigned to the actor, or null.
     */
    public String getActorName() {
        return actorName;
    }

    /**
     * Returns the parent actor to which unrecognized requests are forwarded.
     *
     * @return The parent actor to which unrecognized requests are forwarded, or null.
     */
    public Actor getParent() {
        return parent;
    }
}
