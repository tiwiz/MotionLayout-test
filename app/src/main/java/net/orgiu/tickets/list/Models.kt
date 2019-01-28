package net.orgiu.tickets.list

import android.support.annotation.DrawableRes
import android.support.annotation.StringRes
import net.orgiu.tickets.R
import net.orgiu.tickets.R.drawable.*
import net.orgiu.tickets.R.string.*

data class Ticket(
    val id: Int,
    @StringRes val name: Int,
    @DrawableRes val icon: Int,
    @StringRes val description: Int
)

val tickets = listOf(
    Ticket(
        0,
        single_ticket_name,
        ticket_single,
        single_ticket_description
    ),
    Ticket(
        1,
        daily_ticket_name,
        ticket_daily,
        daily_ticket_description
    ),
    Ticket(
        2,
        weekly_ticket_name,
        ticket_weekly,
        weekly_ticket_description
    ),
    Ticket(
        3,
        monthly_ticket_name,
        ticket_monthly,
        monthly_ticket_description
    ),
    Ticket(
        4,
        yearly_ticket_name,
        ticket_yearly,
        yearly_ticket_description
    )
)